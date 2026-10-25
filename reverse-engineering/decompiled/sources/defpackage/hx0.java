package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.ProcessText_androidKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import app.chalo.compose.SearchFieldSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.usecase.ChaloCustomDateFormat;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryState;
import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryUiModel;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hx0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15868a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hx0(TripPlannerResultsComponent tripPlannerResultsComponent, long j, List list, boolean z, List list2) {
        this.f15868a = 1;
        this.d = tripPlannerResultsComponent;
        this.b = j;
        this.e = list;
        this.c = z;
        this.f = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f15868a) {
            case 0:
                return ProcessText_androidKt.addProcessedTextContextMenuItems_UAq72N0$lambda$0$0((Context) this.d, (ResolveInfo) this.e, this.c, (CharSequence) this.f, this.b, (TextContextMenuSession) obj);
            case 1:
                TripPlannerResultsComponent tripPlannerResultsComponent = (TripPlannerResultsComponent) this.d;
                List list = (List) this.e;
                List list2 = (List) this.f;
                TripPlannerResultsState tripPlannerResultsState = (TripPlannerResultsState) obj;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = tripPlannerResultsComponent.M;
                String str = universalSearchDescriptiveLocationAppModel != null ? universalSearchDescriptiveLocationAppModel.b : null;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = tripPlannerResultsComponent.N;
                String str2 = universalSearchDescriptiveLocationAppModel2 != null ? universalSearchDescriptiveLocationAppModel2.b : null;
                TimeUtilsContract timeUtilsContract = tripPlannerResultsComponent.p;
                long j = this.b;
                String strE = timeUtilsContract.e(j);
                String strA = FormatTimeInMillisToGivenFormatUseCase.a(tripPlannerResultsComponent.t, j, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12);
                boolean z = tripPlannerResultsComponent.K;
                boolean zS0 = tripPlannerResultsComponent.S0();
                TripPlannerResultSectionType tripPlannerResultSectionType = TripPlannerResultSectionType.RECENT;
                SearchFieldSectionType searchFieldSectionType = SearchFieldSectionType.WITH_PROCEED_BTN;
                boolean z2 = this.c;
                return TripPlannerResultsState.a(tripPlannerResultsState, str, str2, strE, strA, z, searchFieldSectionType, zS0, tripPlannerResultSectionType, null, null, list2, null, list, TripPlannerResultsComponent.P0(list, z2), z2, Long.valueOf(j), false, false, false, false, 985856);
            default:
                ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) this.d;
                String str3 = (String) this.e;
                IconType iconType = (IconType) this.f;
                WalletTransactionSummaryState walletTransactionSummaryState = (WalletTransactionSummaryState) obj;
                WalletTransactionSummaryUiModel walletTransactionSummaryUiModel = (WalletTransactionSummaryUiModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                String str4 = walletTransactionSummaryUiModel.f10898a;
                String str5 = walletTransactionSummaryUiModel.b;
                String str6 = walletTransactionSummaryUiModel.c;
                String str7 = walletTransactionSummaryUiModel.d;
                String str8 = walletTransactionSummaryUiModel.e;
                String str9 = walletTransactionSummaryUiModel.h;
                boolean z3 = walletTransactionSummaryUiModel.g;
                WalletTransactionType walletTransactionType = walletTransactionSummaryUiModel.i;
                boolean z4 = false;
                if (walletTransactionType == WalletTransactionType.LOAD_MONEY) {
                    z4 = true;
                }
                return WalletTransactionSummaryState.a(walletTransactionSummaryState, str4, str5, str6, str7, str8, str9, walletTransactionSummaryUiModel.f, str3, z3, z4, walletTransactionType == WalletTransactionType.CHALO_PAY, this.c, iconType, this.b, false, 16384);
        }
    }

    public /* synthetic */ hx0(Object obj, Object obj2, boolean z, Object obj3, long j, int i) {
        this.f15868a = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
        this.f = obj3;
        this.b = j;
    }
}
