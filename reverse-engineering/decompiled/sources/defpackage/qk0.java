package defpackage;

import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.MyTicketsViewIntent;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19128a;
    public final /* synthetic */ MyTicketsComponent b;

    public /* synthetic */ qk0(MyTicketsComponent myTicketsComponent, int i) {
        this.f19128a = i;
        this.b = myTicketsComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19128a) {
            case 0:
                this.b.q1(MyTicketsViewIntent.BackPressedOnNotificationExplainerScreen.f3414a);
                return Unit.f17538a;
            case 1:
                this.b.q1(MyTicketsViewIntent.DismissAlertDialogIntent.f3418a);
                return Unit.f17538a;
            case 2:
                this.b.q1(MyTicketsViewIntent.DismissAlertDialogIntent.f3418a);
                return Unit.f17538a;
            case 3:
                this.b.q1(MyTicketsViewIntent.NavigateToNotificationSettingsIntent.f3424a);
                return Unit.f17538a;
            case 4:
                this.b.q1(MyTicketsViewIntent.NotificationExplainerSkippedIntent.f3425a);
                return Unit.f17538a;
            case 5:
                this.b.q1(MyTicketsViewIntent.ReclaimDialogPositiveCtaClickedIntent.f3433a);
                return Unit.f17538a;
            case 6:
                this.b.q1(MyTicketsViewIntent.ReclaimDialogNegativeCtaClickedIntent.f3432a);
                return Unit.f17538a;
            case 7:
                this.b.q1(MyTicketsViewIntent.DismissAlertDialogIntent.f3418a);
                return Unit.f17538a;
            case 8:
                this.b.q1(MyTicketsViewIntent.DismissAlertDialogIntent.f3418a);
                return Unit.f17538a;
            case 9:
                this.b.q1(MyTicketsViewIntent.ProductPurchaseClickedIntent.f3429a);
                return Unit.f17538a;
            case 10:
                this.b.q1(MyTicketsViewIntent.LogInClickedIntent.f3421a);
                return Unit.f17538a;
            case 11:
                this.b.q1(MyTicketsViewIntent.ReclaimButtonClickedIntent.f3431a);
                return Unit.f17538a;
            case 12:
                return new n4(this.b, 29);
            case 13:
                return new BottomSheetUiState(new BottomSheetUiSpec(null, 15), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new qk0(this.b, 17)), 63));
            case 14:
                return new qk0(this.b, 16);
            case 15:
                return new qk0(this.b, 18);
            case 16:
                this.b.q1(MyTicketsViewIntent.SeeMoreTicketsClickedIntent.f3436a);
                return Unit.f17538a;
            case 17:
                this.b.q1(MyTicketsViewIntent.BottomSheetDismissIntent.f3416a);
                return Unit.f17538a;
            case 18:
                this.b.q1(MyTicketsViewIntent.SeeMorePassesClickedIntent.f3435a);
                return Unit.f17538a;
            default:
                this.b.q1(MyTicketsViewIntent.TabHeaderIconClickedIntent.f3437a);
                return Unit.f17538a;
        }
    }
}
