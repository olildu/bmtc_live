package defpackage;

import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.SeatSelectionBottomSheetType;
import app.chalo.userprofile.Gender;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19778a;
    public final /* synthetic */ List b;
    public final /* synthetic */ PremiumBusSeatSelectionComponent c;

    public /* synthetic */ uu0(List list, PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, int i) {
        this.f19778a = i;
        this.b = list;
        this.c = premiumBusSeatSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SeatSelectionBottomSheetType seatSelectionBottomSheetType;
        PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState = (PremiumBusSeatSelectionDataState) obj;
        switch (this.f19778a) {
            case 0:
                List list = this.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((SeatInfoAppModel) obj2).i) {
                        arrayList.add(obj2);
                    }
                }
                this.c.getClass();
                return PremiumBusSeatSelectionDataState.a(premiumBusSeatSelectionDataState, false, null, list, null, arrayList, false, null, null, PremiumBusSeatSelectionComponent.M0(list), null, null, null, null, 64429);
            case 1:
                List list2 = this.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((SeatInfoAppModel) obj3).i) {
                        arrayList2.add(obj3);
                    }
                }
                this.c.getClass();
                return PremiumBusSeatSelectionDataState.a(premiumBusSeatSelectionDataState, false, null, list2, null, arrayList2, false, null, null, PremiumBusSeatSelectionComponent.M0(list2), null, null, null, null, 64429);
            default:
                List list3 = this.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list3) {
                    if (((SeatInfoAppModel) obj4).i) {
                        arrayList3.add(obj4);
                    }
                }
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.c;
                premiumBusSeatSelectionComponent.getClass();
                boolean zM0 = PremiumBusSeatSelectionComponent.M0(list3);
                if (premiumBusSeatSelectionDataState.m == Gender.FEMALE && premiumBusSeatSelectionDataState.k == GenderPreferenceSelectionStates.PREFERENCE_SELECTED) {
                    premiumBusSeatSelectionComponent.b1();
                    seatSelectionBottomSheetType = SeatSelectionBottomSheetType.WomenReservedSeatsChoice.f7756a;
                } else {
                    seatSelectionBottomSheetType = premiumBusSeatSelectionDataState.l;
                }
                return PremiumBusSeatSelectionDataState.a(premiumBusSeatSelectionDataState, false, null, list3, null, arrayList3, false, null, null, zM0, null, seatSelectionBottomSheetType, null, null, 60333);
        }
    }
}
