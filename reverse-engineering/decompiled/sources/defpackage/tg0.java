package defpackage;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.data.ProductBookingBranding;
import app.chalo.helper.ProductBookingBrandingResolversKt;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19655a;
    public final /* synthetic */ ProductConfigResponseAppModel.SingleJourneyTicketAppModel b;

    public /* synthetic */ tg0(ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, int i) {
        this.f19655a = i;
        this.b = singleJourneyTicketAppModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19655a;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = this.b;
        switch (i) {
            case 0:
                MTicketPassengerSelectionDataState it = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it, "it");
                return MTicketPassengerSelectionDataState.a(it, null, null, null, false, null, this.b, null, false, false, null, null, false, null, null, null, false, 65375);
            case 1:
                MTicketPassengerSelectionDataState it2 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key2 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it2, "it");
                return MTicketPassengerSelectionDataState.a(it2, null, null, null, false, !singleJourneyTicketAppModel.u.f3827a ? ProductBookingBranding.None.INSTANCE : ProductBookingBrandingResolversKt.b(singleJourneyTicketAppModel.k, singleJourneyTicketAppModel.t), null, null, false, false, null, null, false, null, null, null, false, 65519);
            default:
                MTicketTripInfoDataState it3 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it3, "it");
                return MTicketTripInfoDataState.a(it3, null, null, null, null, null, false, ProductBookingBrandingResolversKt.b(singleJourneyTicketAppModel.k, singleJourneyTicketAppModel.t), null, null, 895);
        }
    }
}
