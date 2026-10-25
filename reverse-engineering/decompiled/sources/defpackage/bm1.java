package defpackage;

import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import app.chalo.userprofile.ui.UserProfileFormIntent;
import app.chalo.wallet.ui.access.WalletAccessIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bm1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11212a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ bm1(Function1 function1, int i) {
        this.f11212a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11212a) {
            case 0:
                this.b.invoke(new TicketSummaryIntent.OnBackPressedIntent(null));
                break;
            case 1:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 2:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 3:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 4:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 5:
                this.b.invoke(new UniversalPickerIntent.PermissionRationaleDialogInteraction(true));
                break;
            case 6:
                this.b.invoke(new UniversalPickerIntent.PermissionRationaleDialogInteraction(false));
                break;
            case 7:
                this.b.invoke(UniversalPickerIntent.ClearSearchTextFieldIntent.f5053a);
                break;
            case 8:
                this.b.invoke(UniversalPickerIntent.HomeNavigationButtonPressIntent.f5058a);
                break;
            case 9:
                this.b.invoke(UniversalPickerIntent.ChaloBusCardClicked.f5052a);
                break;
            case 10:
                this.b.invoke(UniversalPickerIntent.OnCurrentLocationItemClicked.f5059a);
                break;
            case 11:
                this.b.invoke(UniversalPickerIntent.OnCurrentLocationItemClicked.f5059a);
                break;
            case 12:
                this.b.invoke(new UserProfileFormIntent.PermissionRationaleDialogInteraction(true));
                break;
            case 13:
                this.b.invoke(UserProfileFormIntent.DobFieldClicked.f10357a);
                break;
            case 14:
                this.b.invoke(UserProfileFormIntent.SaveBtnClicked.f10367a);
                break;
            case 15:
                this.b.invoke(new UserProfileFormIntent.PermissionRationaleDialogInteraction(false));
                break;
            case 16:
                this.b.invoke(UserProfileFormIntent.DialogPositiveBtnClicked.f10356a);
                break;
            case 17:
                this.b.invoke(UserProfileFormIntent.DialogNegativeBtnClicked.f10355a);
                break;
            case 18:
                this.b.invoke(UserProfileFormIntent.BackBtnClicked.f10354a);
                break;
            case 19:
                this.b.invoke(UserProfileFormIntent.UploadProfilePhotoClicked.f10368a);
                break;
            case 20:
                this.b.invoke(UserProfileFormIntent.UploadProfilePhotoClicked.f10368a);
                break;
            case 21:
                this.b.invoke(UserProfileFormIntent.DobFieldClicked.f10357a);
                break;
            case 22:
                this.b.invoke(WalletAccessIntent.LoadMoneyLaterClicked.f10796a);
                break;
            case 23:
                this.b.invoke(WalletAccessIntent.LoadMoneyClicked.f10795a);
                break;
            case 24:
                this.b.invoke(WalletAccessIntent.LoadMoneyLaterClicked.f10796a);
                break;
            case 25:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 26:
                this.b.invoke(WalletAccessIntent.NotActivatedProceedClicked.f10798a);
                break;
            case 27:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 28:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            default:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
        }
        return Unit.f17538a;
    }
}
