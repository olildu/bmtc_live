package defpackage;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.slotselection.MultipleSlotSelectionCalendarState;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17094a;
    public final /* synthetic */ PremiumBusSlotSelectionComponent b;
    public final /* synthetic */ PBAvailableSlotsTripAppModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ MultiSelectionCalendarDataState f;

    public /* synthetic */ iv0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, String str, String str2, MultiSelectionCalendarDataState multiSelectionCalendarDataState, int i) {
        this.f17094a = i;
        this.b = premiumBusSlotSelectionComponent;
        this.c = pBAvailableSlotsTripAppModel;
        this.d = str;
        this.e = str2;
        this.f = multiSelectionCalendarDataState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState = (PremiumBusSlotSelectionDataState) obj;
        switch (this.f17094a) {
            case 0:
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar(new MultipleSlotSelectionCalendarState.DataState(vo1.n(this.b.q.e(this.c.g), " ", this.d), this.e, this.f)), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            default:
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar(new MultipleSlotSelectionCalendarState.DataState(vo1.n(this.b.q.e(this.c.g), " ", this.d), this.e, this.f)), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, EmptyList.f17557a, 2147483615);
        }
    }
}
