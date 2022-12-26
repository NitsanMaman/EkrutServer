package common.connectivity;

import java.io.Serializable;

/**
 * @author Lior Jigalo
 */
public enum MessageFromClient implements Serializable {
    REQUEST_ALL_MACHINES_ORDERS_MONTHLY_REPORT, // V
    REQUEST_ORDER_BY_ORDER_ID_AND_CUSTOMER_ID,  // V
    REQUEST_GENERATE_MONTHLY_INVENTORY_REPORT,  // V
    REQUEST_MACHINE_MONTHLY_INVENTORY_REPORT,   // V
    REQUEST_MACHINE_INVENTORY_REPORT,           // V
    REQUEST_ALL_MACHINE_LOCATIONS,              // V
    REQUEST_ALL_MACHINE_PRODUCTS,               // V
    REQUEST_WAREHOUSE_PRODUCTS,                 // V
    REQUEST_DISCONNECT_CLIENT,                  // V
    REQUEST_LOCATION_PRODUCTS,                  // V
    REQUEST_MACHINE_PRODUCTS,                   // V
    REQUEST_ADD_NEW_ORDER,                      // V
    REQUEST_ALL_PRODUCTS,                       // V
    REQUEST_UPDATE_USER,                        // TODO
    REQUEST_TABLE_ORDER,                        // TODO
    REQUEST_DELETE_USER,                        // V
    REQUEST_MACHINE_IDS,                        // V
    REQUEST_TABLE_USER,                         // TODO
    REQUEST_DISCONNECT,                         // V
    REQUEST_ADD_USER,                           // V
    REQUEST_LOGOUT,                             // V
    REQUEST_LOGIN,                              // V
}
