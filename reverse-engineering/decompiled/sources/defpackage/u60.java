package defpackage;

import app.chalo.home.BottomSheetState;
import app.chalo.home.CommonBottomSheetData;
import app.chalo.home.ui.base.CommonBottomSheetType;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.home.HomeScreenDialogType;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.home.LocationTooltipData;
import app.chalo.home.ui.home.LocationTurnOnTooltipType;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryDataState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.multimodalticket.ui.GroupTicketSelectionUIStateFactory;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.GroupTicketPassengerDetail;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19719a;

    public /* synthetic */ u60(int i) {
        this.f19719a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        switch (this.f19719a) {
            case 0:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, false, null, null, null, null, 0, null, 253);
            case 1:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, false, null, null, null, null, 0, null, 253);
            case 2:
                ChaloTransitMode chaloTransitMode = (ChaloTransitMode) obj;
                Intrinsics.i(chaloTransitMode, "<this>");
                switch (GroupTicketSelectionUIStateFactory.WhenMappings.f5950a[chaloTransitMode.ordinal()]) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        i = 2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Integer.valueOf(i);
            case 3:
                GroupTicketSummaryDataState it = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it, "it");
                return GroupTicketSummaryDataState.a(it, null, null, null, null, false, false, false, false, false, 255);
            case 4:
                GroupTicketSummaryDataState it2 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it2, "it");
                return GroupTicketSummaryDataState.a(it2, null, null, null, null, false, false, false, false, true, 255);
            case 5:
                GroupTicketSummaryDataState it3 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it3, "it");
                return GroupTicketSummaryDataState.a(it3, null, null, null, null, false, false, false, false, false, 255);
            case 6:
                GroupTicketSummaryDataState it4 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it4, "it");
                return GroupTicketSummaryDataState.a(it4, null, null, null, null, false, false, false, true, false, 383);
            case 7:
                GroupTicketSummaryDataState it5 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it5, "it");
                return GroupTicketSummaryDataState.a(it5, null, null, null, null, false, false, false, false, false, 383);
            case 8:
                GroupTicketSummaryDataState it6 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it6, "it");
                return GroupTicketSummaryDataState.a(it6, null, null, null, null, !it6.e, false, false, false, false, 495);
            case 9:
                GroupTicketSummaryDataState it7 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it7, "it");
                return GroupTicketSummaryDataState.a(it7, null, null, null, null, false, true, false, false, false, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
            case 10:
                GroupTicketSummaryDataState it8 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it8, "it");
                return GroupTicketSummaryDataState.a(it8, null, null, null, null, false, false, true, false, false, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
            case 11:
                GroupTicketPassengerDetail it9 = (GroupTicketPassengerDetail) obj;
                Intrinsics.i(it9, "it");
                return it9.c + " " + it9.b;
            case 12:
                HomeScreenFragmentViewState it10 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it10, "it");
                return HomeScreenFragmentViewState.a(it10, null, null, null, null, new BottomSheetState(3), null, null, null, null, null, null, null, false, 32735);
            case 13:
                HomeScreenFragmentViewState it11 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it11, "it");
                return HomeScreenFragmentViewState.a(it11, null, null, null, null, null, null, null, null, null, null, null, null, false, 32639);
            case 14:
                HomeScreenFragmentViewState homeScreenFragmentViewState = (HomeScreenFragmentViewState) obj;
                CommonBottomSheetData bottomSheetData = homeScreenFragmentViewState.f.f2843a;
                Intrinsics.i(bottomSheetData, "bottomSheetData");
                return HomeScreenFragmentViewState.a(homeScreenFragmentViewState, null, null, null, null, new BottomSheetState(bottomSheetData, CommonBottomSheetType.None.b, false), null, null, null, null, null, null, null, false, 32735);
            case 15:
                HomeScreenViewState it12 = (HomeScreenViewState) obj;
                Intrinsics.i(it12, "it");
                return HomeScreenViewState.a(it12, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 522239);
            case 16:
                HomeScreenViewState it13 = (HomeScreenViewState) obj;
                Intrinsics.i(it13, "it");
                return HomeScreenViewState.a(it13, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 491519);
            case 17:
                HomeScreenViewState it14 = (HomeScreenViewState) obj;
                Intrinsics.i(it14, "it");
                return HomeScreenViewState.a(it14, null, null, null, null, null, null, null, null, false, null, null, null, null, null, HomeScreenDialogType.JuspayPermissionRationale.f3552a, false, false, false, 491519);
            case 18:
                HomeScreenViewState it15 = (HomeScreenViewState) obj;
                Intrinsics.i(it15, "it");
                return HomeScreenViewState.a(it15, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 523999);
            case 19:
                HomeScreenViewState it16 = (HomeScreenViewState) obj;
                Intrinsics.i(it16, "it");
                return HomeScreenViewState.a(it16, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 523999);
            case 20:
                HomeScreenViewState it17 = (HomeScreenViewState) obj;
                Intrinsics.i(it17, "it");
                return HomeScreenViewState.a(it17, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 491519);
            case 21:
                HomeScreenViewState it18 = (HomeScreenViewState) obj;
                Intrinsics.i(it18, "it");
                return HomeScreenViewState.a(it18, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 523999);
            case 22:
                HomeScreenViewState it19 = (HomeScreenViewState) obj;
                Intrinsics.i(it19, "it");
                return HomeScreenViewState.a(it19, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 131071);
            case 23:
                HomeScreenViewState it20 = (HomeScreenViewState) obj;
                Intrinsics.i(it20, "it");
                return HomeScreenViewState.a(it20, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, true, 262143);
            case 24:
                HomeScreenViewState it21 = (HomeScreenViewState) obj;
                Intrinsics.i(it21, "it");
                return HomeScreenViewState.a(it21, null, null, null, null, null, null, null, null, false, null, null, null, null, null, HomeScreenDialogType.LocationPermissionRationale.f3553a, false, false, false, 491519);
            case 25:
                return HomeScreenViewState.a((HomeScreenViewState) obj, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 516095);
            case 26:
                return HomeScreenViewState.a((HomeScreenViewState) obj, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 516095);
            case 27:
                HomeScreenViewState it22 = (HomeScreenViewState) obj;
                Intrinsics.i(it22, "it");
                return HomeScreenViewState.a(it22, null, null, null, null, null, null, null, null, false, null, new LocationTooltipData(false, LocationTurnOnTooltipType.Unknown.f3587a), null, null, null, null, false, false, false, 522239);
            case 28:
                return Integer.valueOf(-((Integer) obj).intValue());
            default:
                return Integer.valueOf(-((Integer) obj).intValue());
        }
    }
}
