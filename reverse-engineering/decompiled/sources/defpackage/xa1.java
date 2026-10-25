package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.TextWithSpecialFeaturesTagsKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchViewState;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargedProofImageUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperProofImageUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.userprofile.ui.ProfileIconWithEditBtnUIState;
import app.chalo.userprofile.ui.compose.UserProfileFormScreenKt;
import app.chalo.wallet.ui.loadbalance.compose.WalletSuggestedDenominationsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xa1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20003a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xa1(int i, Modifier modifier, Integer num, int i2) {
        this.f20003a = 8;
        this.c = i;
        this.b = modifier;
        this.e = num;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20003a) {
            case 0:
                ((Integer) obj2).getClass();
                StandardErrorScreenKt.c((StandardErrorScreenUIState) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                StopBasedTripPlannerSearchScreenKt.g((Modifier) this.b, (StopBasedTripPlannerSearchViewState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.d((EnlargedProofImageUIState) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.l((SuperProofImageUIState) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                TextKt.b((Modifier) this.b, (TextUIState.StyledTextUIState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 5:
                ((Integer) obj2).getClass();
                TextWithLeftAndTrailingRightIconComponentKt.a((Modifier) this.b, (TextWithLeftAndRightIconUIState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 6:
                ((Integer) obj2).getClass();
                TextWithSpecialFeaturesTagsKt.a((TextWithSpecialFeaturesTagsUIState) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 7:
                ((Integer) obj2).getClass();
                TitleSubtitleViewKt.a((Modifier) this.b, (TitleSubtitleUiState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                TripPlannerResultsScreenKt.f(this.c, (Modifier) this.b, (Integer) this.e, (Composer) obj, iUpdateChangedFlags);
                break;
            case 9:
                ((Integer) obj2).getClass();
                UserProfileFormScreenKt.e((Modifier) this.b, (ProfileIconWithEditBtnUIState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                WalletSuggestedDenominationsKt.a(this.c, (String) this.e, (Function1) this.b, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ xa1(int i, String str, Function1 function1, int i2) {
        this.f20003a = 10;
        this.c = i;
        this.e = str;
        this.b = function1;
        this.d = i2;
    }

    public /* synthetic */ xa1(Modifier modifier, Object obj, int i, int i2, int i3) {
        this.f20003a = i3;
        this.b = modifier;
        this.e = obj;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ xa1(Object obj, Modifier modifier, int i, int i2, int i3) {
        this.f20003a = i3;
        this.e = obj;
        this.b = modifier;
        this.c = i;
        this.d = i2;
    }
}
