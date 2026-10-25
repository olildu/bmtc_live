package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceRequestCache;
import androidx.compose.ui.text.font.TypefaceResult;
import app.chalo.compose.SearchFieldSectionType;
import app.chalo.compose.SearchFieldWithSwapButtonCardKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.webview.WebViewInternalState;
import app.chalo.compose.webview.WebViewState;
import app.chalo.home.ui.common.VisibleJobTracker;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerConfigModelKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.uistate.webview.WebViewJSInterfaceSpecs;
import app.chalo.userprofile.ui.UserProfileFieldType;
import app.chalo.userprofile.ui.UserProfileFormIntent;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.vault.dao.WalletDaoImpl;
import app.chalo.vault.mapper.WalletTransactionEntityMapperKt;
import app.chalo.wallet.ui.access.ProductFlow;
import app.chalo.wallet.ui.access.WalletAccessManagerImpl;
import app.chalo.wallet.ui.access.WalletAccessSheet;
import app.chalo.wallet.ui.access.WalletAccessState;
import app.chalo.wallet.ui.loadbalance.SuggestAmountsDenominations;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountIntent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountViewState;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import defpackage.de0;
import defpackage.pk0;
import defpackage.s01;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ol1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18651a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ol1(int i, Object obj, Object obj2) {
        this.f18651a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductFlow productFlow;
        WalletTypeIdentifier walletTypeIdentifier;
        int i = this.f18651a;
        final int i2 = 0;
        final int i3 = 1;
        Unit unit = Unit.f17538a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                TripPlannerResultsState tripPlannerResultsState = (TripPlannerResultsState) obj;
                SearchFieldSectionType searchFieldSectionType = SearchFieldSectionType.WITH_PROCEED_BTN;
                List list = TripPlannerResultsComponent.Z;
                return TripPlannerResultsState.a(tripPlannerResultsState, null, null, null, null, false, searchFieldSectionType, ((TripPlannerResultsComponent) obj3).S0(), TripPlannerResultSectionType.ERROR, (String) obj2, null, null, null, null, null, false, null, false, false, false, false, 1048095);
            case 1:
                final TripPlannerResultsState tripPlannerResultsState2 = (TripPlannerResultsState) obj3;
                final Function1 function1 = (Function1) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-584271604, true, new Function3() { // from class: vl1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        switch (i2) {
                            case 0:
                                LazyItemScope item = (LazyItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Integer) obj6).intValue();
                                Intrinsics.i(item, "$this$item");
                                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-584271604, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:275)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).f), composer, 0);
                                    TripPlannerResultsState tripPlannerResultsState3 = tripPlannerResultsState2;
                                    String str = tripPlannerResultsState3.f4792a;
                                    String str2 = tripPlannerResultsState3.b;
                                    String str3 = tripPlannerResultsState3.c;
                                    boolean z = tripPlannerResultsState3.e;
                                    if (!z) {
                                        str3 = null;
                                    }
                                    String str4 = z ? tripPlannerResultsState3.d : null;
                                    SearchFieldSectionType searchFieldSectionType2 = tripPlannerResultsState3.f;
                                    boolean z2 = tripPlannerResultsState3.g;
                                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null);
                                    Function1 function2 = function1;
                                    boolean zChanged = composer.changed(function2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new s01(function2, 29);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function3 = (Function1) objRememberedValue;
                                    boolean zChanged2 = composer.changed(function2);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new rj1(function2, 15);
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue2;
                                    boolean zChanged3 = composer.changed(function2);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new rj1(function2, 16);
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function0 function4 = (Function0) objRememberedValue3;
                                    boolean zChanged4 = composer.changed(function2);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new rj1(function2, 17);
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function0 function5 = (Function0) objRememberedValue4;
                                    boolean zChanged5 = composer.changed(function2);
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new rj1(function2, 18);
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    SearchFieldWithSwapButtonCardKt.b(modifierM786paddingVpY3zN4$default, str, null, str2, null, null, str3, str4, searchFieldSectionType2, null, z2, function3, function0, function4, function5, (Function0) objRememberedValue5, composer, 0, 0);
                                    if (gf.x(companion, ChaloTheme.b(composer, 0).g, composer, 0)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                LazyItemScope item2 = (LazyItemScope) obj4;
                                Composer composer2 = (Composer) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                Intrinsics.i(item2, "$this$item");
                                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1320016025, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:340)");
                                    }
                                    if (TripPlannerConfigModelKt.a(tripPlannerResultsState2.n)) {
                                        composer2.startReplaceGroup(123246777);
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Function1 function6 = function1;
                                        boolean zChanged6 = composer2.changed(function6);
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new rj1(function6, 19);
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        }
                                        TripPlannerResultsScreenKt.b(6, composer2, modifierFillMaxWidth$default, (Function0) objRememberedValue6);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(123505875);
                                        TripPlannerResultsScreenKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6);
                                        composer2.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                LazyItemScope item3 = (LazyItemScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                Intrinsics.i(item3, "$this$item");
                                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1370947398, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:363)");
                                    }
                                    List list2 = tripPlannerResultsState2.k;
                                    Function1 function7 = function1;
                                    boolean zChanged7 = composer3.changed(function7);
                                    Object objRememberedValue7 = composer3.rememberedValue();
                                    if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new wl1(function7, 0);
                                        composer3.updateRememberedValue(objRememberedValue7);
                                    }
                                    TripPlannerResultsScreenKt.q(0, composer3, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), list2, (Function1) objRememberedValue7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.f17538a;
                    }
                }), 3, null);
                TripPlannerResultSectionType tripPlannerResultSectionType = tripPlannerResultsState2.h;
                final List list2 = tripPlannerResultsState2.j;
                int i4 = TripPlannerResultsScreenKt.WhenMappings.f4805a[tripPlannerResultSectionType.ordinal()];
                if (i4 != 1) {
                    final int i5 = 2;
                    if (i4 != 2) {
                        if (i4 == 3) {
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$TripPlannerResultsScreenKt.c, 3, null);
                            LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-27858000, true, new lj1(tripPlannerResultsState2.m, tripPlannerResultsState2.n, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new s01(function1, 26), tripPlannerResultsState2.o, new rj1(function1, 9))), 3, null);
                            List list3 = list2;
                            if (list3 == null || list3.isEmpty()) {
                                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1320016025, true, new Function3() { // from class: vl1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        switch (i3) {
                                            case 0:
                                                LazyItemScope item = (LazyItemScope) obj4;
                                                Composer composer = (Composer) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                Intrinsics.i(item, "$this$item");
                                                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-584271604, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:275)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).f), composer, 0);
                                                    TripPlannerResultsState tripPlannerResultsState3 = tripPlannerResultsState2;
                                                    String str = tripPlannerResultsState3.f4792a;
                                                    String str2 = tripPlannerResultsState3.b;
                                                    String str3 = tripPlannerResultsState3.c;
                                                    boolean z = tripPlannerResultsState3.e;
                                                    if (!z) {
                                                        str3 = null;
                                                    }
                                                    String str4 = z ? tripPlannerResultsState3.d : null;
                                                    SearchFieldSectionType searchFieldSectionType2 = tripPlannerResultsState3.f;
                                                    boolean z2 = tripPlannerResultsState3.g;
                                                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null);
                                                    Function1 function2 = function1;
                                                    boolean zChanged = composer.changed(function2);
                                                    Object objRememberedValue = composer.rememberedValue();
                                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new s01(function2, 29);
                                                        composer.updateRememberedValue(objRememberedValue);
                                                    }
                                                    Function1 function3 = (Function1) objRememberedValue;
                                                    boolean zChanged2 = composer.changed(function2);
                                                    Object objRememberedValue2 = composer.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new rj1(function2, 15);
                                                        composer.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    Function0 function0 = (Function0) objRememberedValue2;
                                                    boolean zChanged3 = composer.changed(function2);
                                                    Object objRememberedValue3 = composer.rememberedValue();
                                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = new rj1(function2, 16);
                                                        composer.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    Function0 function4 = (Function0) objRememberedValue3;
                                                    boolean zChanged4 = composer.changed(function2);
                                                    Object objRememberedValue4 = composer.rememberedValue();
                                                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = new rj1(function2, 17);
                                                        composer.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    Function0 function5 = (Function0) objRememberedValue4;
                                                    boolean zChanged5 = composer.changed(function2);
                                                    Object objRememberedValue5 = composer.rememberedValue();
                                                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = new rj1(function2, 18);
                                                        composer.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    SearchFieldWithSwapButtonCardKt.b(modifierM786paddingVpY3zN4$default, str, null, str2, null, null, str3, str4, searchFieldSectionType2, null, z2, function3, function0, function4, function5, (Function0) objRememberedValue5, composer, 0, 0);
                                                    if (gf.x(companion, ChaloTheme.b(composer, 0).g, composer, 0)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer.skipToGroupEnd();
                                                }
                                                break;
                                            case 1:
                                                LazyItemScope item2 = (LazyItemScope) obj4;
                                                Composer composer2 = (Composer) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                Intrinsics.i(item2, "$this$item");
                                                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1320016025, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:340)");
                                                    }
                                                    if (TripPlannerConfigModelKt.a(tripPlannerResultsState2.n)) {
                                                        composer2.startReplaceGroup(123246777);
                                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        Function1 function6 = function1;
                                                        boolean zChanged6 = composer2.changed(function6);
                                                        Object objRememberedValue6 = composer2.rememberedValue();
                                                        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new rj1(function6, 19);
                                                            composer2.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        TripPlannerResultsScreenKt.b(6, composer2, modifierFillMaxWidth$default, (Function0) objRememberedValue6);
                                                        composer2.endReplaceGroup();
                                                    } else {
                                                        composer2.startReplaceGroup(123505875);
                                                        TripPlannerResultsScreenKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6);
                                                        composer2.endReplaceGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer2.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                LazyItemScope item3 = (LazyItemScope) obj4;
                                                Composer composer3 = (Composer) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                Intrinsics.i(item3, "$this$item");
                                                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1370947398, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:363)");
                                                    }
                                                    List list4 = tripPlannerResultsState2.k;
                                                    Function1 function7 = function1;
                                                    boolean zChanged7 = composer3.changed(function7);
                                                    Object objRememberedValue7 = composer3.rememberedValue();
                                                    if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue7 = new wl1(function7, 0);
                                                        composer3.updateRememberedValue(objRememberedValue7);
                                                    }
                                                    TripPlannerResultsScreenKt.q(0, composer3, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), list4, (Function1) objRememberedValue7);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer3.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                }), 3, null);
                            } else {
                                boolean z = tripPlannerResultsState2.r;
                                boolean z2 = tripPlannerResultsState2.t;
                                final s01 s01Var = new s01(function1, 27);
                                rj1 rj1Var = new rj1(function1, 10);
                                final xj1 xj1Var = new xj1(21);
                                LazyColumn.items(list2.size(), new Function1<Integer, Object>() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$tripPlannerItinerariesResultItems$$inlined$items$default$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        return xj1Var.invoke(list2.get(((Number) obj4).intValue()));
                                    }
                                }, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$tripPlannerItinerariesResultItems$$inlined$items$default$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        list2.get(((Number) obj4).intValue());
                                        return null;
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$tripPlannerItinerariesResultItems$$inlined$items$default$4
                                    @Override // kotlin.jvm.functions.Function4
                                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                        int i6;
                                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Composer composer = (Composer) obj6;
                                        int iIntValue2 = ((Number) obj7).intValue();
                                        if ((iIntValue2 & 6) == 0) {
                                            i6 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                                        } else {
                                            i6 = iIntValue2;
                                        }
                                        if ((iIntValue2 & 48) == 0) {
                                            i6 |= composer.changed(iIntValue) ? 32 : 16;
                                        }
                                        if (composer.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(802480018, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                            }
                                            final TripPlannerItineraryUiModel tripPlannerItineraryUiModel = (TripPlannerItineraryUiModel) list2.get(iIntValue);
                                            composer.startReplaceGroup(-1705964854);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierC = de0.c(lazyItemScope, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composer, 0).n, null, 2, null), null, null, null, 7, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            if (composer.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer.startReusableNode();
                                            if (composer.getInserting()) {
                                                composer.createNode(constructor);
                                            } else {
                                                composer.useNode();
                                            }
                                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                                            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            final s01 s01Var2 = s01Var;
                                            boolean zChanged = composer.changed(s01Var2) | composer.changedInstance(tripPlannerItineraryUiModel);
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0<Unit>() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$tripPlannerItinerariesResultItems$2$1$1$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        s01Var2.invoke(tripPlannerItineraryUiModel.f4753a);
                                                        return Unit.f17538a;
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            TripPlannerResultsScreenKt.h(tripPlannerItineraryUiModel, (Function0) objRememberedValue, pk0.d("PL_Trip_Itinerary_Card_", tripPlannerItineraryUiModel.h, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null)), tripPlannerItineraryUiModel.h, composer, 0);
                                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).g), composer, 0);
                                            composer.endNode();
                                            composer.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer.skipToGroupEnd();
                                        }
                                        return Unit.f17538a;
                                    }
                                }));
                                if (z) {
                                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$TripPlannerResultsScreenKt.e, 3, null);
                                }
                                if (z2) {
                                    LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1345262591, true, new ti1(rj1Var, 6)), 3, null);
                                }
                                LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$TripPlannerResultsScreenKt.f, 3, null);
                            }
                        } else {
                            if (i4 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list4 = tripPlannerResultsState2.k;
                            if (list4 != null && !list4.isEmpty()) {
                                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1370947398, true, new Function3() { // from class: vl1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        switch (i5) {
                                            case 0:
                                                LazyItemScope item = (LazyItemScope) obj4;
                                                Composer composer = (Composer) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                Intrinsics.i(item, "$this$item");
                                                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-584271604, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:275)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).f), composer, 0);
                                                    TripPlannerResultsState tripPlannerResultsState3 = tripPlannerResultsState2;
                                                    String str = tripPlannerResultsState3.f4792a;
                                                    String str2 = tripPlannerResultsState3.b;
                                                    String str3 = tripPlannerResultsState3.c;
                                                    boolean z3 = tripPlannerResultsState3.e;
                                                    if (!z3) {
                                                        str3 = null;
                                                    }
                                                    String str4 = z3 ? tripPlannerResultsState3.d : null;
                                                    SearchFieldSectionType searchFieldSectionType2 = tripPlannerResultsState3.f;
                                                    boolean z4 = tripPlannerResultsState3.g;
                                                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null);
                                                    Function1 function2 = function1;
                                                    boolean zChanged = composer.changed(function2);
                                                    Object objRememberedValue = composer.rememberedValue();
                                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new s01(function2, 29);
                                                        composer.updateRememberedValue(objRememberedValue);
                                                    }
                                                    Function1 function3 = (Function1) objRememberedValue;
                                                    boolean zChanged2 = composer.changed(function2);
                                                    Object objRememberedValue2 = composer.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new rj1(function2, 15);
                                                        composer.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    Function0 function0 = (Function0) objRememberedValue2;
                                                    boolean zChanged3 = composer.changed(function2);
                                                    Object objRememberedValue3 = composer.rememberedValue();
                                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = new rj1(function2, 16);
                                                        composer.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    Function0 function4 = (Function0) objRememberedValue3;
                                                    boolean zChanged4 = composer.changed(function2);
                                                    Object objRememberedValue4 = composer.rememberedValue();
                                                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = new rj1(function2, 17);
                                                        composer.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    Function0 function5 = (Function0) objRememberedValue4;
                                                    boolean zChanged5 = composer.changed(function2);
                                                    Object objRememberedValue5 = composer.rememberedValue();
                                                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = new rj1(function2, 18);
                                                        composer.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    SearchFieldWithSwapButtonCardKt.b(modifierM786paddingVpY3zN4$default, str, null, str2, null, null, str3, str4, searchFieldSectionType2, null, z4, function3, function0, function4, function5, (Function0) objRememberedValue5, composer, 0, 0);
                                                    if (gf.x(companion, ChaloTheme.b(composer, 0).g, composer, 0)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer.skipToGroupEnd();
                                                }
                                                break;
                                            case 1:
                                                LazyItemScope item2 = (LazyItemScope) obj4;
                                                Composer composer2 = (Composer) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                Intrinsics.i(item2, "$this$item");
                                                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1320016025, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:340)");
                                                    }
                                                    if (TripPlannerConfigModelKt.a(tripPlannerResultsState2.n)) {
                                                        composer2.startReplaceGroup(123246777);
                                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        Function1 function6 = function1;
                                                        boolean zChanged6 = composer2.changed(function6);
                                                        Object objRememberedValue6 = composer2.rememberedValue();
                                                        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new rj1(function6, 19);
                                                            composer2.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        TripPlannerResultsScreenKt.b(6, composer2, modifierFillMaxWidth$default, (Function0) objRememberedValue6);
                                                        composer2.endReplaceGroup();
                                                    } else {
                                                        composer2.startReplaceGroup(123505875);
                                                        TripPlannerResultsScreenKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6);
                                                        composer2.endReplaceGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer2.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                LazyItemScope item3 = (LazyItemScope) obj4;
                                                Composer composer3 = (Composer) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                Intrinsics.i(item3, "$this$item");
                                                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1370947398, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:363)");
                                                    }
                                                    List list5 = tripPlannerResultsState2.k;
                                                    Function1 function7 = function1;
                                                    boolean zChanged7 = composer3.changed(function7);
                                                    Object objRememberedValue7 = composer3.rememberedValue();
                                                    if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue7 = new wl1(function7, 0);
                                                        composer3.updateRememberedValue(objRememberedValue7);
                                                    }
                                                    TripPlannerResultsScreenKt.q(0, composer3, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), list5, (Function1) objRememberedValue7);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer3.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                }), 3, null);
                            }
                        }
                    } else if (tripPlannerResultsState2.i != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(283987848, true, new ti1(tripPlannerResultsState2, 5)), 3, null);
                    }
                } else {
                    LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-27858000, true, new lj1(tripPlannerResultsState2.m, tripPlannerResultsState2.n, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new s01(function1, 25), tripPlannerResultsState2.o, new rj1(function1, 8))), 3, null);
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$TripPlannerResultsScreenKt.b, 3, null);
                }
                return unit;
            case 2:
                return TypefaceRequestCache.runCached$lambda$1((TypefaceRequestCache) obj3, (TypefaceRequest) obj2, (TypefaceResult) obj);
            case 3:
                Function1 function2 = (Function1) obj3;
                Integer num = (Integer) obj;
                num.intValue();
                ((MutableIntState) obj2).setIntValue(0);
                if (function2 != null) {
                    function2.invoke(num);
                }
                return unit;
            case 4:
                return UpdatableAnimationState.animateToZero$lambda$2((UpdatableAnimationState) obj3, (Function1) obj2, ((Long) obj).longValue());
            case 5:
                ((Function1) obj3).invoke(new UserProfileFormIntent.FieldFocusChanged((UserProfileFieldType) obj2, ((Boolean) obj).booleanValue()));
                return unit;
            case 6:
                UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState = (UserProfilingChaloBusStickyBannerUIState) obj3;
                MutableState mutableState = (MutableState) obj2;
                if (((Boolean) obj).booleanValue() && !((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.TRUE);
                    userProfilingChaloBusStickyBannerUIState.h.invoke();
                }
                return unit;
            case 7:
                UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState = (UserProfilingHomeStickyBannerUIState) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                if (((Boolean) obj).booleanValue() && !((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState2.setValue(Boolean.TRUE);
                    userProfilingHomeStickyBannerUIState.f.invoke();
                }
                return unit;
            case 8:
                ((VisibleJobTracker) obj3).f3386a.remove((Job) obj2);
                return unit;
            case 9:
                WalletAccessManagerImpl walletAccessManagerImpl = (WalletAccessManagerImpl) obj3;
                Long l = (Long) obj2;
                WalletAccessState it = (WalletAccessState) obj;
                Intrinsics.i(it, "it");
                StateFlow stateFlow = walletAccessManagerImpl.t;
                TimeUtilsContract timeUtilsContract = walletAccessManagerImpl.l;
                return new WalletAccessState(((WalletAccessState) stateFlow.getValue()).f10810a, ((WalletAccessState) stateFlow.getValue()).b, WalletAccessSheet.AppReclaim, l, l != null ? timeUtilsContract.e(l.longValue()) : null, l != null ? timeUtilsContract.j(l.longValue()) : null, null, 6268);
            case 10:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj3;
                StateFlow stateFlow2 = ((WalletAccessManagerImpl) obj2).t;
                WalletAccessState oldState = (WalletAccessState) obj;
                Intrinsics.i(oldState, "oldState");
                if (oldState.f && (((productFlow = oldState.l) == ProductFlow.QUICK_PAY || productFlow == ProductFlow.WALLET_BALANCE) && (walletTypeIdentifier = oldState.b) != null && !walletTypeIdentifier.d)) {
                    booleanRef.element = true;
                }
                return new WalletAccessState(((WalletAccessState) stateFlow2.getValue()).f10810a, ((WalletAccessState) stateFlow2.getValue()).b, booleanRef.element ? WalletAccessSheet.WalletActivated : null, null, null, null, null, 8056);
            case 11:
                WalletDaoImpl walletDaoImpl = (WalletDaoImpl) obj3;
                WalletTransactionEntity walletTransactionEntity = (WalletTransactionEntity) obj2;
                walletDaoImpl.A().W(walletTransactionEntity.e);
                walletDaoImpl.A().b0(WalletTransactionEntityMapperKt.a(walletTransactionEntity));
                return unit;
            case 12:
                final Function1 function3 = (Function1) obj2;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                final List list5 = ((WalletLoadBalanceEnterAmountViewState) obj3).e;
                final do1 do1Var = new do1(29);
                LazyRow.items(list5.size(), new Function1<Integer, Object>() { // from class: app.chalo.wallet.ui.loadbalance.compose.WalletLoadBalanceEnterAmountComposableKt$WalletLoadBalanceEnterAmountComposable$lambda$0$2$0$0$$inlined$items$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return do1Var.invoke(list5.get(((Number) obj4).intValue()));
                    }
                }, new Function1<Integer, Object>() { // from class: app.chalo.wallet.ui.loadbalance.compose.WalletLoadBalanceEnterAmountComposableKt$WalletLoadBalanceEnterAmountComposable$lambda$0$2$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        list5.get(((Number) obj4).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.wallet.ui.loadbalance.compose.WalletLoadBalanceEnterAmountComposableKt$WalletLoadBalanceEnterAmountComposable$lambda$0$2$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i6 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i6 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i6 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            SuggestAmountsDenominations suggestAmountsDenominations = (SuggestAmountsDenominations) list5.get(iIntValue);
                            composer.startReplaceGroup(-1250703750);
                            int i7 = suggestAmountsDenominations.f10826a;
                            String str = suggestAmountsDenominations.b;
                            final Function1 function4 = function3;
                            boolean zChanged = composer.changed(function4);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<Integer, Unit>() { // from class: app.chalo.wallet.ui.loadbalance.compose.WalletLoadBalanceEnterAmountComposableKt$WalletLoadBalanceEnterAmountComposable$1$3$1$1$2$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj8) {
                                        function4.invoke(new WalletLoadBalanceEnterAmountIntent.SuggestedDenominationClickedIntent(((Number) obj8).intValue()));
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            WalletSuggestedDenominationsKt.a(i7, str, (Function1) objRememberedValue, composer, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                return unit;
            case 13:
                WebViewState webViewState = (WebViewState) obj3;
                MutableState mutableState3 = (MutableState) obj2;
                Context context = (Context) obj;
                Intrinsics.i(context, "context");
                WebView webView = new WebView(context);
                WebView webView2 = webViewState.c;
                if (webView2 != null) {
                    webView2.destroy();
                }
                webViewState.c = webView;
                Function1 function4 = webViewState.f1936a;
                if (function4 != null) {
                    function4.invoke(webView);
                }
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(((WebViewInternalState) mutableState3.getValue()).h);
                settings.setBuiltInZoomControls(((WebViewInternalState) mutableState3.getValue()).d);
                settings.setDisplayZoomControls(((WebViewInternalState) mutableState3.getValue()).e);
                settings.setUseWideViewPort(((WebViewInternalState) mutableState3.getValue()).f);
                webView.setInitialScale(((WebViewInternalState) mutableState3.getValue()).g);
                Iterator it2 = ((WebViewInternalState) mutableState3.getValue()).i.iterator();
                while (it2.hasNext()) {
                    webView.addJavascriptInterface(((WebViewJSInterfaceSpecs) it2.next()).f10128a, "AndroidInterface");
                }
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                WebSettings settings2 = webView.getSettings();
                settings2.setAllowFileAccess(false);
                settings2.setAllowContentAccess(false);
                webView.getSettings().setMixedContentMode(1);
                return webView;
            case 14:
                return WideNavigationRailKt.Scrim_3J_VO9M$lambda$33$lambda$32((String) obj2, (MutableState) obj3, (SemanticsPropertyReceiver) obj);
            default:
                return WindowInsetsHolder.Companion.current$lambda$0$0((WindowInsetsHolder) obj3, (View) obj2, (DisposableEffectScope) obj);
        }
    }

    public /* synthetic */ ol1(String str, MutableState mutableState) {
        this.f18651a = 14;
        this.c = str;
        this.b = mutableState;
    }
}
