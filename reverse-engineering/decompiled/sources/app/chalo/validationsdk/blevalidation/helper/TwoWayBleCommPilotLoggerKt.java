package app.chalo.validationsdk.blevalidation.helper;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TwoWayBleCommPilotLoggerKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10561a;

        static {
            int[] iArr = new int[BLEEventType.values().length];
            try {
                iArr[BLEEventType.START_ACTIVE_MODE_BROADCAST_CALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLEEventType.START_ACTIVE_MODE_BROADCAST_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLEEventType.START_ACTIVE_MODE_BROADCAST_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BLEEventType.START_DUPLEX_CONNECTION_OPERATION_CALLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BLEEventType.START_DUPLEX_CONNECTION_OPERATION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BLEEventType.START_DUPLEX_CONNECTION_OPERATION_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BLEEventType.SEND_DATA_ON_CONNECTION_CALLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BLEEventType.SEND_DATA_ON_CONNECTION_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BLEEventType.SEND_DATA_ON_CONNECTION_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BLEEventType.CONNECTION_LIST_UPDATED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BLEEventType.CONNECTION_HISTORY_LIST_UPDATED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BLEEventType.DATA_RECEIVED_ON_CONNECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BLEEventType.STOP_BLE_VALIDATION_WITH_DELAY_CALLED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BLEEventType.STOP_BLE_VALIDATION_SUCCESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BLEEventType.STOP_BLE_VALIDATION_FAILED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BLEEventType.STOP_BLE_ACTIVE_MODE_BROADCAST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BLEEventType.STOP_ALL_BLE_OP_AND_SWITCH_OFF_BLUETOOTH_CALLED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f10561a = iArr;
        }
    }
}
