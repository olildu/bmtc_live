package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListMeasuredItemProvider;
import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.datastore.preferences.core.Preferences;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.android.MainActivity;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.core.Last_ride_info_tableQueries;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.login.ui.options.LoginOptionsDataState;
import app.chalo.login.ui.options.LoginOptionsIntent;
import app.chalo.login.ui.options.LoginSupportedCountryDialogUIState;
import app.chalo.login.ui.otp.LoginOtpEnterComponent;
import app.chalo.login.ui.otp.LoginOtpEnterDataState;
import app.chalo.login.ui.otp.LoginOtpEnterIntent;
import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.metro.ui.landing.MetroLandingScreenHelper;
import app.chalo.metro.ui.landing.MetroLandingScreenHelperSideEffect;
import app.chalo.metro.ui.landing.MetroLandingScreenHelperState;
import app.chalo.metro.ui.landing.MetroLandingScreenRestoredState;
import app.chalo.metro.ui.landing.MetroStopsListResultType;
import app.chalo.models.LastRideInfo;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoIntent;
import app.chalo.onboarding.languageselection.LanguageGridUiState;
import app.chalo.onboarding.languageselection.LanguageSelectionDataState;
import app.chalo.onboarding.languageselection.LanguageSelectionIntent;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.vault.Keystorage;
import app.chalo.vault.Load_money_table;
import com.arkivanov.decompose.router.stack.ChildStack;
import com.arkivanov.essenty.backhandler.BackCallback;
import com.arkivanov.essenty.backhandler.BackCallbackKt$BackCallback$1;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapNode;
import com.google.maps.android.compose.MarkerNode;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.MatcherMatchResult$groups$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15449a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd0(Object obj, int i) {
        this.f15449a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.f15449a;
        int i2 = 5;
        Unit unit = Unit.f17538a;
        int i3 = 0;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Keystorage keystorage = (Keystorage) obj3;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.d(0, Long.valueOf(keystorage.f10746a));
                execute.d(1, Long.valueOf(keystorage.b));
                execute.bindString(2, keystorage.c);
                execute.bindString(3, keystorage.d);
                return unit;
            case 1:
                LanguageSelectionDataState it = (LanguageSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return LanguageSelectionDataState.a(it, false, null, false, false, null, null, ((LanguageSelectionIntent.LanguageSelected) obj3).f6654a, null, 191);
            case 2:
                LanguageGridUiState languageGridUiState = (LanguageGridUiState) obj3;
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                Intrinsics.i(LazyVerticalGrid, "$this$LazyVerticalGrid");
                LazyGridScope.CC.b(LazyVerticalGrid, languageGridUiState.f6645a.size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(1759357018, true, new o4(languageGridUiState, i2)), 14, null);
                return unit;
            case 3:
                SqlCursor cursor = (SqlCursor) obj;
                Intrinsics.i(cursor, "cursor");
                return (LastRideInfo) cb0.f(cursor, 0, ((Last_ride_info_tableQueries) obj3).b.f1963a);
            case 4:
                return Float.valueOf(LazyGridState.scrollableState$lambda$0((LazyGridState) obj3, ((Float) obj).floatValue()));
            case 5:
                return LazyGridState.Companion.saver$lambda$1((LazyGridPrefetchStrategy) obj3, (List) obj);
            case 6:
                return LazyListMeasureKt.measureLazyList__s_dbAc$lambda$7((LazyListMeasuredItemProvider) obj3, ((Integer) obj).intValue());
            case 7:
                return Float.valueOf(LazyListState.scrollableState$lambda$0((LazyListState) obj3, ((Float) obj).floatValue()));
            case 8:
                return LazyListState.Companion.saver$lambda$1((LazyListPrefetchStrategy) obj3, (List) obj);
            case 9:
                return LazyStaggeredGridIntervalContent.item$lambda$2$0((StaggeredGridItemSpan) obj3, ((Integer) obj).intValue());
            case 10:
                return Float.valueOf(LazyStaggeredGridState.scrollableState$lambda$0((LazyStaggeredGridState) obj3, ((Float) obj).floatValue()));
            case 11:
                Load_money_table load_money_table = (Load_money_table) obj3;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, load_money_table.f10747a);
                execute2.d(1, Long.valueOf(load_money_table.b));
                execute2.d(2, Long.valueOf(load_money_table.c));
                execute2.bindString(3, load_money_table.d);
                execute2.bindString(4, load_money_table.e);
                execute2.bindString(5, load_money_table.f);
                execute2.bindString(6, load_money_table.g);
                execute2.bindString(7, load_money_table.h);
                return unit;
            case 12:
                LoginOptionsDataState it2 = (LoginOptionsDataState) obj;
                Intrinsics.i(it2, "it");
                return LoginOptionsDataState.a(it2, null, null, null, false, null, false, null, null, null, null, false, ((LoginOptionsIntent.PhoneNumberFieldFocusChangeIntent) obj3).f5313a, 16383);
            case 13:
                LoginOptionsDataState it3 = (LoginOptionsDataState) obj;
                Intrinsics.i(it3, "it");
                return LoginOptionsDataState.a(it3, "", (CountryPhoneNumberConfig) obj3, null, false, null, false, null, null, null, null, false, false, 24540);
            case 14:
                final LoginSupportedCountryDialogUIState loginSupportedCountryDialogUIState = (LoginSupportedCountryDialogUIState) obj3;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.o(LazyColumn, loginSupportedCountryDialogUIState.b.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-2105590586, true, new Function4() { // from class: app.chalo.login.ui.options.a
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        LazyItemScope items = (LazyItemScope) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Integer) obj7).intValue();
                        Intrinsics.i(items, "$this$items");
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2105590586, iIntValue2, -1, "app.chalo.login.ui.options.LoginSupportedCountryDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginOptionsScreen.kt:178)");
                            }
                            LoginSupportedCountryDialogUIState loginSupportedCountryDialogUIState2 = loginSupportedCountryDialogUIState;
                            ArrayList arrayList = loginSupportedCountryDialogUIState2.b;
                            LoginSupportedCountryDialogSpec loginSupportedCountryDialogSpec = loginSupportedCountryDialogUIState2.d;
                            SupportedCountryItemUIState supportedCountryItemUIState = (SupportedCountryItemUIState) arrayList.get(iIntValue);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = supportedCountryItemUIState.d;
                            boolean zChangedInstance = composer.changedInstance(uiEventHandler$Companion$fromLambda$1);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                LoginOptionsScreenKt$LoginSupportedCountryDialog$1$1$1$1$1$1$1 loginOptionsScreenKt$LoginSupportedCountryDialog$1$1$1$1$1$1$1 = new LoginOptionsScreenKt$LoginSupportedCountryDialog$1$1$1$1$1$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                                composer.updateRememberedValue(loginOptionsScreenKt$LoginSupportedCountryDialog$1$1$1$1$1$1$1);
                                objRememberedValue = loginOptionsScreenKt$LoginSupportedCountryDialog$1$1$1$1$1$1$1;
                            }
                            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM299clickableoSLSa3U$default);
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
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            if (iIntValue > 0) {
                                composer.startReplaceGroup(419966126);
                                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, loginSupportedCountryDialogSpec.b), composer, 0);
                            } else {
                                composer.startReplaceGroup(413545778);
                            }
                            composer.endReplaceGroup();
                            LoginOptionsScreenKt.g(null, supportedCountryItemUIState, composer, 0);
                            if (iIntValue < CollectionsKt.K(loginSupportedCountryDialogUIState2.b)) {
                                composer.startReplaceGroup(420237190);
                                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, loginSupportedCountryDialogSpec.c), composer, 0);
                                DividerKt.m1949Divider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
                            } else {
                                composer.startReplaceGroup(413545778);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }), 6, null);
                return unit;
            case 15:
                LoginOtpEnterIntent.InitializationIntent initializationIntent = (LoginOtpEnterIntent.InitializationIntent) obj3;
                LoginOtpEnterDataState it4 = (LoginOtpEnterDataState) obj;
                Intrinsics.i(it4, "it");
                return LoginOtpEnterDataState.a(it4, null, false, null, false, 0L, false, initializationIntent.f5332a, initializationIntent.b, initializationIntent.c, initializationIntent.d, 127);
            case 16:
                String it5 = (String) obj;
                Intrinsics.i(it5, "it");
                ((LoginOtpEnterComponent) obj3).O0(new LoginOtpEnterIntent.OnOtpEnteredIntent(it5));
                return unit;
            case 17:
                LoginOtpEnterDataState it6 = (LoginOtpEnterDataState) obj;
                Intrinsics.i(it6, "it");
                return LoginOtpEnterDataState.a(it6, ((LoginOtpEnterIntent.OnOtpEnteredIntent) obj3).f5335a, false, null, false, 0L, false, null, null, null, null, 2046);
            case 18:
                LoginOtpEnterDataState it7 = (LoginOtpEnterDataState) obj;
                Intrinsics.i(it7, "it");
                long j = ((LoginOtpEnterIntent.OnResendOtpEnableCountdownUpdate) obj3).f5338a;
                return LoginOtpEnterDataState.a(it7, null, false, null, false, j, j <= 0, null, null, null, null, 1951);
            case 19:
                MTicketPassengerSelectionDataState it8 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it8, "it");
                return MTicketPassengerSelectionDataState.a(it8, null, null, null, false, null, null, null, false, false, null, (MTicketFareResponseAppModel) obj3, false, null, null, null, false, 63999);
            case 20:
                MTicketTripInfoDataState it9 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it9, "it");
                return MTicketTripInfoDataState.a(it9, null, ((MTicketTripInfoIntent.RouteDataReceivedIntent) obj3).f5771a, null, null, null, false, null, null, null, 481);
            case 21:
                MTicketTripInfoIntent.StopDataReceivedIntent stopDataReceivedIntent = (MTicketTripInfoIntent.StopDataReceivedIntent) obj3;
                MTicketTripInfoDataState it10 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it10, "it");
                boolean z = stopDataReceivedIntent.f5773a;
                ProductBookingStopDetails productBookingStopDetails = stopDataReceivedIntent.b;
                ProductBookingStopDetails productBookingStopDetails2 = z ? productBookingStopDetails : it10.c;
                if (z) {
                    productBookingStopDetails = it10.d;
                }
                return MTicketTripInfoDataState.a(it10, null, null, productBookingStopDetails2, productBookingStopDetails, null, false, null, null, null, 499);
            case 22:
                BackCallbackKt$BackCallback$1 backCallbackKt$BackCallback$1 = (BackCallbackKt$BackCallback$1) obj3;
                ChildStack rootStack = (ChildStack) obj;
                AtomicInteger atomicInteger = MainActivity.o1;
                Intrinsics.i(rootStack, "rootStack");
                backCallbackKt$BackCallback$1.c.setValue(backCallbackKt$BackCallback$1, BackCallback.d[0], Boolean.valueOf(rootStack.c.size() == 1 && (rootStack.f12382a.b instanceof RootComponent.Child.Home)));
                return unit;
            case 23:
                Marker marker = (Marker) obj;
                Intrinsics.i(marker, "marker");
                ArrayList arrayList = ((MapApplier) obj3).d;
                int size = arrayList.size();
                while (i3 < size) {
                    obj2 = arrayList.get(i3);
                    i3++;
                    MapNode mapNode = (MapNode) obj2;
                    if ((mapNode instanceof MarkerNode) && ((MarkerNode) mapNode).b.equals(marker)) {
                        return (MarkerNode) obj2;
                    }
                }
                obj2 = null;
                return (MarkerNode) obj2;
            case 24:
                return ((MatcherMatchResult$groups$1) obj3).a(((Integer) obj).intValue());
            case 25:
                MetroLandingScreenDataState it11 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it11, "it");
                return MetroLandingScreenDataState.a(it11, false, null, null, null, null, ((MetroStopsListResultType.WithMapping) ((MetroStopsListResultType) obj3)).f5511a, null, null, null, null, null, null, null, 8159);
            case 26:
                MetroLandingScreenRestoredState metroLandingScreenRestoredState = (MetroLandingScreenRestoredState) obj3;
                MetroLandingScreenDataState it12 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it12, "it");
                return MetroLandingScreenDataState.a(it12, false, metroLandingScreenRestoredState.f5493a, metroLandingScreenRestoredState.b, null, metroLandingScreenRestoredState.e, metroLandingScreenRestoredState.f, metroLandingScreenRestoredState.g, null, null, metroLandingScreenRestoredState.h, metroLandingScreenRestoredState.i, metroLandingScreenRestoredState.j, null, 4489);
            case 27:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, false, null, null, Boolean.valueOf(((MetroLandingScreenHelper) obj3).c()), null, null, null, null, null, null, null, null, null, 8182);
            case 28:
                MetroLandingScreenHelperState metroLandingScreenHelperState = (MetroLandingScreenHelperState) obj3;
                MetroLandingScreenDataState it13 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it13, "it");
                return MetroLandingScreenDataState.a(it13, false, null, null, null, null, null, null, metroLandingScreenHelperState.f5492a, metroLandingScreenHelperState.b, null, null, null, null, 7807);
            default:
                MetroLandingScreenDataState it14 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it14, "it");
                return MetroLandingScreenDataState.a(it14, ((MetroLandingScreenHelperSideEffect.TriggerLoadingDialog) ((MetroLandingScreenHelperSideEffect) obj3)).f5491a, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
        }
    }
}
