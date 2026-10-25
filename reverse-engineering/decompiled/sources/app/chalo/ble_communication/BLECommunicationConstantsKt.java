package app.chalo.ble_communication;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ble-communication_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BLECommunicationConstantsKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BLELogEventType.values().length];
            try {
                iArr[BLELogEventType.ADVERTISEMENT_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLELogEventType.ACKNOWLEDGEMENT_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLELogEventType.FAILED_SENDING_ADVERTISEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BLELogEventType.STOP_ADVERTISEMENT_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BLELogEventType.STOP_ADVERTISEMENT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BLELogEventType.SEND_ADVERTISEMENT_REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BLELogEventType.SEND_ADVERTISEMENT_IN_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BLELogEventType.SEND_ADVERTISEMENT_NOT_STARTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BLELogEventType.SEND_ADVERTISEMENT_ON_NEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BLELogEventType.STOP_ADVERTISEMENT_REJECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BLELogEventType.STOP_ADVERTISEMENT_IN_PROGRESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BLELogEventType.STOP_ADVERTISEMENT_NOT_STARTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BLELogEventType.STOP_ADVERTISEMENT_ON_NEXT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }
}
