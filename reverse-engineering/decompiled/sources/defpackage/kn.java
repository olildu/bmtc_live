package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.CityLocationConfigFetchErrorScreenKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.data.ChaloTextDataKt;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.home.BottomSheetState;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.CommonBottomSheetType;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kn implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17513a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ kn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f17513a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        Composer composer2;
        boolean z;
        int i = this.f17513a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj10;
                Color color = (Color) obj9;
                String str = (String) obj8;
                IconType iconType = (IconType) obj7;
                ChaloTextWithBackgroundData chaloTextWithBackgroundData = (ChaloTextWithBackgroundData) obj6;
                List<ChaloTextWithBackgroundData> list = (List) obj5;
                List<ChaloTextWithBackgroundData> list2 = (List) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-768374327, iIntValue, -1, "app.chalo.compose.components.ChaloHorizontalWidgetCard.<anonymous> (ChaloWidgetCard.kt:324)");
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), color != null ? color.m4615unboximpl() : Color.INSTANCE.m4640getTransparent0d7_KjU(), null, 2, null), ChaloTheme.b(composer3, 6).h);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer3, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Object objRememberedValue = composer3.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue == companion3.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion3.getEmpty()) {
                        objRememberedValue2 = SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, Dp.m7278constructorimpl(76)), Dp.m7278constructorimpl(86));
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifier2 = (Modifier) objRememberedValue2;
                    if (str == null) {
                        composer3.startReplaceGroup(-1418259406);
                        composer3.endReplaceGroup();
                        composer = composer3;
                    } else {
                        composer3.startReplaceGroup(-1418259405);
                        ContentScale fit = ContentScale.INSTANCE.getFit();
                        Alignment centerStart = companion.getCenterStart();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1309651808, true, new en(iconType, modifier2, mutableState, 1), composer3, 54);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion3.getEmpty()) {
                            objRememberedValue3 = new g5(mutableState, 13);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        SingletonSubcomposeAsyncImageKt.a(str, null, modifier2, null, null, composableLambdaRememberComposableLambda, (Function1) objRememberedValue3, null, centerStart, fit, composer3, 102236592, 54, 62136);
                        composer = composer3;
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            composer.startReplaceGroup(1579131006);
                            ChaloSpacersKt.y(composer, 0);
                        } else {
                            composer.startReplaceGroup(1566338143);
                        }
                        composer.endReplaceGroup();
                        composer.endReplaceGroup();
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (chaloTextWithBackgroundData == null || !ChaloTextDataKt.c(chaloTextWithBackgroundData.h.f2406a)) {
                        composer.startReplaceGroup(-1869444525);
                    } else {
                        composer.startReplaceGroup(-1856357100);
                        ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData, composer, 48);
                    }
                    composer.endReplaceGroup();
                    if (list == null) {
                        composer.startReplaceGroup(-1856165707);
                    } else {
                        composer.startReplaceGroup(-1856165706);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                        int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion4);
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
                        pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                        ChaloSpacersKt.t(composer, 0);
                        composer.startReplaceGroup(714474577);
                        for (ChaloTextWithBackgroundData chaloTextWithBackgroundData2 : list) {
                            if (ChaloTextDataKt.c(chaloTextWithBackgroundData2.h.f2406a)) {
                                composer.startReplaceGroup(-1559096735);
                                ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData2, composer, 48);
                            } else {
                                composer.startReplaceGroup(-1572560903);
                            }
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                    }
                    composer.endReplaceGroup();
                    if (list2 == null) {
                        composer.startReplaceGroup(-1855669676);
                    } else {
                        composer.startReplaceGroup(-1855669675);
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                        int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion5);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer);
                        pk0.v(companion6, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        ChaloSpacersKt.n(composer, 0);
                        composer.startReplaceGroup(101756890);
                        for (ChaloTextWithBackgroundData chaloTextWithBackgroundData3 : list2) {
                            if (ChaloTextDataKt.c(chaloTextWithBackgroundData3.h.f2406a)) {
                                composer.startReplaceGroup(475096280);
                                ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData3, composer, 48);
                            } else {
                                composer.startReplaceGroup(461135120);
                            }
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                    }
                    composer.endReplaceGroup();
                    if (r1.k(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            default:
                SheetState sheetState = (SheetState) obj10;
                Function1 function1 = (Function1) obj9;
                HomeScreenInfoHelper homeScreenInfoHelper = (HomeScreenInfoHelper) obj8;
                HomeScreenFragmentViewState homeScreenFragmentViewState = (HomeScreenFragmentViewState) obj7;
                HomeScreenConfigAppModel homeScreenConfigAppModel = (HomeScreenConfigAppModel) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                HomeComponent homeComponent = (HomeComponent) obj4;
                PaddingValues innerPadding = (PaddingValues) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(innerPadding, "innerPadding");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer4.changed(innerPadding) ? 4 : 2;
                }
                int i6 = iIntValue2;
                if (composer4.shouldExecute((i6 & 19) != 18, i6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(252598083, i6, -1, "app.chalo.home.ui.base.BottomNavigationUI.<anonymous> (HomeScreenMainDecompose.kt:257)");
                    }
                    if (!((BottomSheetState) mutableState2.getValue()).c || sheetState == null) {
                        composer2 = composer4;
                        composer2.startReplaceGroup(355382047);
                    } else {
                        composer4.startReplaceGroup(367154359);
                        CommonBottomSheetType commonBottomSheetType = ((BottomSheetState) mutableState2.getValue()).b;
                        Intrinsics.i(commonBottomSheetType, "<this>");
                        if (commonBottomSheetType.equals(CommonBottomSheetType.ChaloAppRatingsBottomSheet.b) || commonBottomSheetType.equals(CommonBottomSheetType.ChaloOnlineCardRechargeTutorialBottomSheet.b) || commonBottomSheetType.equals(CommonBottomSheetType.CityChangeBottomSheet.b) || commonBottomSheetType.equals(CommonBottomSheetType.CityNotSupportedBottomSheet.b) || commonBottomSheetType.equals(CommonBottomSheetType.NotificationPermissionBottomSheet.b) || commonBottomSheetType.equals(CommonBottomSheetType.RideHailingUserFeedbackBottomSheet.b) || commonBottomSheetType.equals(CommonBottomSheetType.UserProfilingBottomSheet.b) || (commonBottomSheetType instanceof CommonBottomSheetType.SuperPassVerificationBottomSheet.Rejected) || (commonBottomSheetType instanceof CommonBottomSheetType.SuperPassVerificationBottomSheet.Verified)) {
                            z = false;
                        } else {
                            if (!commonBottomSheetType.equals(CommonBottomSheetType.None.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = true;
                        }
                        boolean zChanged = composer4.changed(function1) | composer4.changedInstance(homeScreenInfoHelper);
                        Object objRememberedValue4 = composer4.rememberedValue();
                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new m(12, function1, homeScreenInfoHelper, mutableState2);
                            composer4.updateRememberedValue(objRememberedValue4);
                        }
                        ChaloRoundedBottomSheetKt.a(sheetState, (Function0) objRememberedValue4, z, false, false, ComposableLambdaKt.rememberComposableLambda(1369018978, true, new ob(10, function1, homeScreenFragmentViewState, mutableState2), composer4, 54), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
                        composer2 = composer4;
                    }
                    composer2.endReplaceGroup();
                    int i7 = HomeScreenMainDecomposeKt.WhenMappings.f3226a[homeScreenFragmentViewState.j.ordinal()];
                    if (i7 == 1) {
                        composer2.startReplaceGroup(375381542);
                        ChaloCircularLoadingBoxKt.a(null, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (i7 == 2) {
                        composer2.startReplaceGroup(375529846);
                        if (homeScreenFragmentViewState.h) {
                            composer2.startReplaceGroup(375540355);
                            ChaloLoadingDialogKt.b(null, false, null, composer2, 0, 7);
                        } else {
                            composer2.startReplaceGroup(355382047);
                        }
                        composer2.endReplaceGroup();
                        if (homeScreenConfigAppModel == null || homeScreenConfigAppModel.c.isEmpty()) {
                            composer2.startReplaceGroup(375720744);
                            String str2 = homeScreenFragmentViewState.i;
                            boolean z2 = homeScreenFragmentViewState.o;
                            boolean zChanged2 = composer2.changed(function1);
                            Object objRememberedValue5 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new q70(function1, 6);
                                composer2.updateRememberedValue(objRememberedValue5);
                            }
                            Function0 function0 = (Function0) objRememberedValue5;
                            boolean zChanged3 = composer2.changed(function1);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new q70(function1, 7);
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            CityLocationConfigFetchErrorScreenKt.a(null, str2, z2, function0, (Function0) objRememberedValue6, composer2, 0, 1);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(376250565);
                            NavigationTabAppModel navigationTabAppModel = homeScreenFragmentViewState.f3225a;
                            if (navigationTabAppModel == null) {
                                composer2.startReplaceGroup(376250564);
                            } else {
                                composer2.startReplaceGroup(376250565);
                                NavigationTabAppModel navigationTabAppModel2 = homeScreenFragmentViewState.b;
                                List list3 = homeScreenConfigAppModel.c;
                                NavigationTabAppModel.Companion companion7 = NavigationTabAppModel.INSTANCE;
                                HomeScreenMainDecomposeKt.f(homeComponent, navigationTabAppModel, navigationTabAppModel2, innerPadding, list3, homeScreenInfoHelper, function1, composer2, (i6 << 9) & 7168);
                            }
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    } else {
                        if (i7 != 3) {
                            throw pk0.p(composer2, -2066101470);
                        }
                        composer2.startReplaceGroup(376895396);
                        String str3 = homeScreenFragmentViewState.i;
                        boolean z3 = homeScreenFragmentViewState.o;
                        boolean zChanged4 = composer2.changed(function1);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new q70(function1, 8);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        Function0 function2 = (Function0) objRememberedValue7;
                        boolean zChanged5 = composer2.changed(function1);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new q70(function1, 9);
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        CityLocationConfigFetchErrorScreenKt.a(null, str3, z3, function2, (Function0) objRememberedValue8, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
        }
    }
}
