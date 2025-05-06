#include <stdio.h>
#include <math.h>
#include <string.h>

// Constants for the cost calculations
const double COST_PER_HOUR = 18.50;
const double COST_PER_MINUTE = 0.40;
const double COST_OF_DINNER = 20.70;

// Structure to simulate a class in OOP
typedef struct {
    char eventName[50];
    char firstName[50];
    char lastName[50];
    int numGuests;
    int numMinutes;
    int numServers;
    double costPerServer;
    double totalFoodCost;
    double averageCostPerPerson;
    double totalCost;
    double depositAmount;
} Event;

// Function prototypes
int calculateServers(int guests);
double calculateCostPerServer(int minutes);
double calculateTotalFoodCost(int guests);
double calculateAverageCost(double foodCost, int guests);
double calculateTotalCost(double foodCost, double costPerServer, int servers);
double calculateDeposit(double totalCost);
void displaySummary(Event e);

int main() {
    Event e;

    // User Input
    printf("Enter the name of the event: ");
    fgets(e.eventName, sizeof(e.eventName), stdin);
    e.eventName[strcspn(e.eventName, "\n")] = 0; // remove trailing newline

    printf("Enter your first name: ");
    scanf("%s", e.firstName);

    printf("Enter your last name: ");
    scanf("%s", e.lastName);

    // Validating number of guests input
    do {
        printf("Enter number of guests: ");
        scanf("%d", &e.numGuests);
        if (e.numGuests < 0)
            printf("Number of guests cannot be negative.\n");
    } while (e.numGuests < 0);

    // Validating number of minutes input
    do {
        printf("Enter number of minutes for the event: ");
        scanf("%d", &e.numMinutes);
        if (e.numMinutes < 0)
            printf("Number of minutes cannot be negative.\n");
    } while (e.numMinutes < 0);

    // Calculations
    e.numServers = calculateServers(e.numGuests);
    e.costPerServer = calculateCostPerServer(e.numMinutes);
    e.totalFoodCost = calculateTotalFoodCost(e.numGuests);
    e.averageCostPerPerson = calculateAverageCost(e.totalFoodCost, e.numGuests);
    e.totalCost = calculateTotalCost(e.totalFoodCost, e.costPerServer, e.numServers);
    e.depositAmount = calculateDeposit(e.totalCost);

    // Output Summary
    displaySummary(e);

    return 0;
}

// Calculate how many servers are needed
int calculateServers(int guests) {
    return (int)ceil((double)guests / 20);
}

// Calculate cost per server based on duration
double calculateCostPerServer(int minutes) {
    int hours = minutes / 60;
    int remainingMinutes = minutes % 60;
    return (hours * COST_PER_HOUR) + (remainingMinutes * COST_PER_MINUTE);
}

// Calculate total food cost
double calculateTotalFoodCost(int guests) {
    return guests * COST_OF_DINNER;
}

// Calculate average cost per guest
double calculateAverageCost(double foodCost, int guests) {
    if (guests == 0) return 0;
    return foodCost / guests;
}

// Calculate total event cost
double calculateTotalCost(double foodCost, double costPerServer, int servers) {
    return foodCost + (costPerServer * servers);
}

// Calculate deposit amount (25%)
double calculateDeposit(double totalCost) {
    return totalCost * 0.25;
}

// Display all the event details
void displaySummary(Event e) {
    printf("\n======= Event Summary =======\n");
    printf("Event Name: %s\n", e.eventName);
    printf("Organizer: %s %s\n", e.firstName, e.lastName);
    printf("Number of Guests: %d\n", e.numGuests);
    printf("Duration: %d minutes\n", e.numMinutes);
    printf("Servers Needed: %d\n", e.numServers);
    printf("Cost per Server: $%.2f\n", e.costPerServer);
    printf("Total Food Cost: $%.2f\n", e.totalFoodCost);
    printf("Average Cost per Person: $%.2f\n", e.averageCostPerPerson);
    printf("Total Event Cost: $%.2f\n", e.totalCost);
    printf("Deposit Required (25%%): $%.2f\n", e.depositAmount);
    printf("==============================\n");
}

