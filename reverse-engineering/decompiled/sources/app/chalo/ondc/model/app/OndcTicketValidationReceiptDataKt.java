package app.chalo.ondc.model.app;

import app.chalo.models.ondc.OndcTicketReceiptAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketValidationReceiptDataKt {
    public static final OndcTicketValidationReceiptData a(OndcTicketReceiptAppModel ondcTicketReceiptAppModel) {
        Intrinsics.i(ondcTicketReceiptAppModel, "<this>");
        return new OndcTicketValidationReceiptData(ondcTicketReceiptAppModel.f5630a, ondcTicketReceiptAppModel.b, ondcTicketReceiptAppModel.c, ondcTicketReceiptAppModel.e, ondcTicketReceiptAppModel.d, ondcTicketReceiptAppModel.g, ondcTicketReceiptAppModel.h, ondcTicketReceiptAppModel.f, ondcTicketReceiptAppModel.i, ondcTicketReceiptAppModel.j, ondcTicketReceiptAppModel.l);
    }
}
