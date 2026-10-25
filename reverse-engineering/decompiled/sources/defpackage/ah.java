package defpackage;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Placeable;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState;
import app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState;
import app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputStateKt;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoErrorType;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoFilterUIState;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionSheetState;
import app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ah implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287a;

    public /* synthetic */ ah(int i) {
        this.f287a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f287a) {
            case 0:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, true, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 1:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 2:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 3:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 4:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 5:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 6:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 7:
                ChaloBusViewState state = (ChaloBusViewState) obj;
                Intrinsics.i(state, "state");
                return ChaloBusViewState.a(state, null, false, state.c + 1, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435451);
            case 8:
                ChaloBusRouteInfoDataState it = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it, "it");
                return ChaloBusRouteInfoDataState.a(it, null, false, null, null, null, null, null, null, new RouteSuggestionSheetState.Form(null, null, null, false), 255);
            case 9:
                RouteSuggestionSheetState.Form form = (RouteSuggestionSheetState.Form) obj;
                Intrinsics.i(form, "form");
                return RouteSuggestionSheetState.Form.a(form, null, null, null, true, 7);
            case 10:
                ChaloBusRouteInfoDataState it2 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it2, "it");
                return ChaloBusRouteInfoDataState.a(it2, null, false, null, null, null, null, null, null, null, 255);
            case 11:
                ChaloBusRouteInfoDataState it3 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it3, "it");
                EmptyList emptyList = EmptyList.f17557a;
                return ChaloBusRouteInfoDataState.a(it3, null, false, emptyList, null, emptyList, emptyList, null, ChaloBusRouteInfoErrorType.NoRoutesAvailable.f3318a, null, 257);
            case 12:
                RouteSuggestionSheetState.Form form2 = (RouteSuggestionSheetState.Form) obj;
                Intrinsics.i(form2, "form");
                return RouteSuggestionSheetState.Form.a(form2, null, null, null, false, 7);
            case 13:
                ChaloBusRouteInfoDataState it4 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it4, "it");
                return ChaloBusRouteInfoDataState.a(it4, null, false, null, null, null, null, null, null, RouteSuggestionSheetState.Success.f3371a, 255);
            case 14:
                ChaloBusRouteInfoFilterUIState it5 = (ChaloBusRouteInfoFilterUIState) obj;
                Intrinsics.i(it5, "it");
                return it5.f3321a.b;
            case 15:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(350, 0, null, 6, null), new ah(17)).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(250, 0, null, 6, null), new ah(18)).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(250, 0, null, 6, null), 0.0f, 2, null)));
            case 16:
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.i(layout, "$this$layout");
                return Unit.f17538a;
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 18:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 19:
                ChaloBusUserProfileSurveyDataState it6 = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it6, "it");
                return ChaloBusUserProfileSurveyDataState.a(it6, null, null, 0, true, null, null, false, 119);
            case 20:
                ChaloBusUserProfileSurveyDataState it7 = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it7, "it");
                return ChaloBusUserProfileSurveyDataState.a(it7, null, null, 0, false, null, null, false, ComposerKt.reuseKey);
            case 21:
                ChaloBusUserProfileSurveyDataState it8 = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it8, "it");
                return ChaloBusUserProfileSurveyDataState.a(it8, null, null, 0, true, null, null, false, 247);
            case 22:
                PBUserProfileSurveyInputState it9 = (PBUserProfileSurveyInputState) obj;
                Intrinsics.i(it9, "it");
                return PBUserProfileSurveyInputStateKt.a(it9);
            case 23:
                return ChaloBusUserProfileSurveyDataState.a((ChaloBusUserProfileSurveyDataState) obj, null, null, 0, false, null, null, true, 119);
            case 24:
                return ChaloBusUserProfileSurveyDataState.a((ChaloBusUserProfileSurveyDataState) obj, null, null, 0, false, null, null, false, 183);
            case 25:
                return ChaloBusUserProfileSurveyDataState.a((ChaloBusUserProfileSurveyDataState) obj, null, null, 0, false, null, null, true, 119);
            case 26:
                ChaloCardInfoViewState it10 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it10, "it");
                return ChaloCardInfoViewState.a(it10, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, CardInfoLandingScreenBottomSheetType.None.f6341a, false, 6291455);
            case 27:
                ChaloCardInfoViewState it11 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it11, "it");
                return ChaloCardInfoViewState.a(it11, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388606);
            case 28:
                ChaloCardInfoViewState it12 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it12, "it");
                return ChaloCardInfoViewState.a(it12, null, null, true, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            default:
                ChaloCardInfoViewState it13 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it13, "it");
                return ChaloCardInfoViewState.a(it13, null, null, true, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
        }
    }
}
