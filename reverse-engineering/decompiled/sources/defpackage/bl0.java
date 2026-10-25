package defpackage;

import app.chalo.home.ui.history.MyTicketsViewIntent;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetNegativeCtaType;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11208a = 1;
    public final /* synthetic */ TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bl0(TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet, Function1 function1) {
        this.b = ticketsPageInfoBottomSheet;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11208a) {
            case 0:
                TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet = this.b;
                this.c.invoke(new MyTicketsViewIntent.InfoBottomSheetPositiveCtaClickedIntent(ticketsPageInfoBottomSheet.e, ticketsPageInfoBottomSheet.c, ticketsPageInfoBottomSheet.b, ticketsPageInfoBottomSheet.d));
                break;
            default:
                TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet2 = this.b;
                TicketsPageInfoBottomSheetNegativeCtaType ticketsPageInfoBottomSheetNegativeCtaType = ticketsPageInfoBottomSheet2.f;
                if (ticketsPageInfoBottomSheetNegativeCtaType != null) {
                    this.c.invoke(new MyTicketsViewIntent.InfoBottomSheetNegativeCtaClickedIntent(ticketsPageInfoBottomSheetNegativeCtaType, ticketsPageInfoBottomSheet2.c, ticketsPageInfoBottomSheet2.b, ticketsPageInfoBottomSheet2.d));
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ bl0(Function1 function1, TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet) {
        this.c = function1;
        this.b = ticketsPageInfoBottomSheet;
    }
}
