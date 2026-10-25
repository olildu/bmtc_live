package app.chalo.multimodalticket.validation;

import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.InstantTicketReceiptNotificationEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationPayloadKt {
    public static final ValidationPayloadIdentity a(AppNotification.PunchNotification punchNotification) {
        Intrinsics.i(punchNotification, "<this>");
        if (!(punchNotification instanceof InstantTicketReceiptNotificationEvent)) {
            if (!(punchNotification instanceof AppNotification.PunchNotification.OndcMetroPunchEvent)) {
                return null;
            }
            AppNotification.PunchNotification.OndcMetroPunchEvent ondcMetroPunchEvent = (AppNotification.PunchNotification.OndcMetroPunchEvent) punchNotification;
            return new ValidationPayloadIdentity(ondcMetroPunchEvent.c, ondcMetroPunchEvent.d, ondcMetroPunchEvent.e);
        }
        InstantTicketReceiptNotificationEvent instantTicketReceiptNotificationEvent = (InstantTicketReceiptNotificationEvent) punchNotification;
        String str = instantTicketReceiptNotificationEvent.e;
        if (str != null) {
            return new ValidationPayloadIdentity(str, instantTicketReceiptNotificationEvent.c, instantTicketReceiptNotificationEvent.d);
        }
        return null;
    }
}
