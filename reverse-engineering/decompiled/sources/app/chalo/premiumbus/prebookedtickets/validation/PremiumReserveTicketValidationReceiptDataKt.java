package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketValidationReceiptDataKt {
    public static final PremiumReserveTicketValidationReceiptData a(PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel) {
        Intrinsics.i(premiumReserveTicketReceiptAppModel, "<this>");
        return new PremiumReserveTicketValidationReceiptData(premiumReserveTicketReceiptAppModel.f7116a, premiumReserveTicketReceiptAppModel.i, premiumReserveTicketReceiptAppModel.j, premiumReserveTicketReceiptAppModel.b, premiumReserveTicketReceiptAppModel.c, premiumReserveTicketReceiptAppModel.g, premiumReserveTicketReceiptAppModel.h, premiumReserveTicketReceiptAppModel.f, premiumReserveTicketReceiptAppModel.d, premiumReserveTicketReceiptAppModel.e, premiumReserveTicketReceiptAppModel.l, (String) null, (String) null, RouteNamingSchemeType.DEFAULT, premiumReserveTicketReceiptAppModel.m, 2048);
    }
}
