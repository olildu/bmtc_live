package app.chalo.premiumbus.ui.stopdetails.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloScrollableTabRowKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.HorizontalImageDialogViewerKt;
import app.chalo.compose.components.HorizontalImageViewerDialogImageType;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMainScreenStopSectionType;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMapState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.utils.SheetDefaultsHelperKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.af;
import defpackage.fk0;
import defpackage.gf;
import defpackage.mh;
import defpackage.pk0;
import defpackage.q80;
import defpackage.qm0;
import defpackage.r80;
import defpackage.uo0;
import defpackage.v;
import defpackage.wm0;
import defpackage.wo0;
import defpackage.xo0;
import defpackage.ym0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBStopDetailsMainScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7953a;

        static {
            int[] iArr = new int[PBStopDetailsMainScreenStopSectionType.values().length];
            try {
                iArr[PBStopDetailsMainScreenStopSectionType.PICK_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PBStopDetailsMainScreenStopSectionType.DROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7953a = iArr;
        }
    }

    public static final void a(PremiumBusStopDetailsViewState state, Function1 sendIntent, Function1 onSheetContentHeightAvailableInDp, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(state, "state");
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(onSheetContentHeightAvailableInDp, "onSheetContentHeightAvailableInDp");
        Composer composerStartRestartGroup = composer.startRestartGroup(1634358948);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSheetContentHeightAvailableInDp) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634358948, i2, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsBottomSheetContent (PBStopDetailsMainScreen.kt:199)");
            }
            List listS = CollectionsKt.S(PBStopDetailsMainScreenStopSectionType.PICK_UP, PBStopDetailsMainScreenStopSectionType.DROP);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new af(listS, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 384, 3);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).i, 7, null);
            boolean zChanged = ((i2 & 896) == 256) | composerStartRestartGroup.changed(density);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new mh(density, onSheetContentHeightAvailableInDp, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM788paddingqDBjuR0$default, (Function1) objRememberedValue3);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            f(54, pagerStateRememberPagerState, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), listS, coroutineScope);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, null, null, 0, 0.0f, companion3.getTop(), null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1231051685, true, new q80(1, listS, state, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 24576, 16318);
            composerStartRestartGroup = composerStartRestartGroup;
            int i5 = (composerStartRestartGroup.changed(pagerStateRememberPagerState) ? 1 : 0) | (composerStartRestartGroup.changedInstance(state) ? 1 : 0) | ((i2 & 112) != 32 ? 0 : 1);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i5 != 0 || objRememberedValue4 == companion.getEmpty()) {
                i3 = 0;
                PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1 pBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1 = new PBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1(pagerStateRememberPagerState, listS, state, sendIntent, null);
                composerStartRestartGroup.updateRememberedValue(pBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1);
                objRememberedValue4 = pBStopDetailsMainScreenKt$PBStopDetailsBottomSheetContent$2$2$1;
            } else {
                i3 = 0;
            }
            EffectsKt.LaunchedEffect(pagerStateRememberPagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 5, state, sendIntent, onSheetContentHeightAvailableInDp));
        }
    }

    public static final void b(Modifier modifier, List list, int i, Function0 onDialogueDismiss, Composer composer, int i2) {
        int i3;
        Object obj;
        Intrinsics.i(onDialogueDismiss, "onDialogueDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-401086298);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDialogueDismiss) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-401086298, i3, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsImageZoomDialog (PBStopDetailsMainScreen.kt:170)");
            }
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new HorizontalImageViewerDialogImageType.Url((String) it.next()));
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue;
            int i4 = (i3 & 14) | 48;
            int i5 = i3 << 15;
            HorizontalImageDialogViewerKt.b(modifier, new DialogProperties(true, true, false), StringResourcesHelperKt.c(StringEnum.IMAGES, new Object[0], composerStartRestartGroup, 6), ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), ChaloTheme.a(composerStartRestartGroup, 0).i, (List) obj, i, onDialogueDismiss, composerStartRestartGroup, i4 | (29360128 & i5) | (i5 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(modifier, list, i, onDialogueDismiss, i2, 21));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(PBStopDetailsComponent pBStopDetailsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1165201052);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pBStopDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165201052, i2, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreen (PBStopDetailsMainScreen.kt:65)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(pBStopDetailsComponent.t0(), composerStartRestartGroup);
            BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(SheetDefaultsHelperKt.a(false, null, SheetValue.Expanded, true, composerStartRestartGroup, 3456, 51), null, composerStartRestartGroup, 0, 2);
            PremiumBusStopDetailsViewState premiumBusStopDetailsViewState = (PremiumBusStopDetailsViewState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pBStopDetailsComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ym0(pBStopDetailsComponent, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            d(premiumBusStopDetailsViewState, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(pBStopDetailsComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new uo0(pBStopDetailsComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(pBStopDetailsComponent, i, 7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(PremiumBusStopDetailsViewState premiumBusStopDetailsViewState, BottomSheetScaffoldState bottomSheetScaffoldState, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-658724082);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusStopDetailsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-658724082, i4, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreen (PBStopDetailsMainScreen.kt:92)");
            }
            float fB = ComposeUtils_androidKt.b(composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(fB);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Dp.m7276boximpl(Dp.m7278constructorimpl(fB / 2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float fM7292unboximpl = ((Dp) objRememberedValue).m7292unboximpl();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState = premiumBusStopDetailsViewState.f;
            if (pBStopDetailsZoomedImageState instanceof PBStopDetailsZoomedImageState.Show) {
                composerStartRestartGroup.startReplaceGroup(-343045733);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                PBStopDetailsZoomedImageState.Show show = (PBStopDetailsZoomedImageState.Show) premiumBusStopDetailsViewState.f;
                List list = show.f7941a;
                int i5 = show.b;
                boolean z = (i4 & 896) == 256;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new qm0(function1, 23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                i3 = 1;
                obj = null;
                b(modifierM786paddingVpY3zN4$default, list, i5, (Function0) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = 1;
                obj = null;
                if (!Intrinsics.d(pBStopDetailsZoomedImageState, PBStopDetailsZoomedImageState.Hide.f7940a)) {
                    throw pk0.p(composerStartRestartGroup, -1673636463);
                }
                composerStartRestartGroup.startReplaceGroup(-342635758);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, i3, obj);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (premiumBusStopDetailsViewState.f7950a) {
                composerStartRestartGroup.startReplaceGroup(-1022104439);
                ChaloCircularProgressIndicatorKt.b(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (premiumBusStopDetailsViewState.b) {
                composerStartRestartGroup.startReplaceGroup(-1021914905);
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), companion3.getCenter());
                boolean z2 = (i4 & 896) == 256;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new qm0(function1, 24);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                StandardErrorScreenKt.a(modifierAlign, null, null, null, null, null, false, (Function0) objRememberedValue4, composerStartRestartGroup, 0, WebSocketProtocol.PAYLOAD_SHORT);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1021544610);
                BottomSheetScaffoldKt.m1663BottomSheetScaffoldsdMYb0k(ComposableLambdaKt.rememberComposableLambda(-1766180360, true, new xo0(fM7292unboximpl, 0, premiumBusStopDetailsViewState, function1, mutableState), composerStartRestartGroup, 54), null, bottomSheetScaffoldState, ((Dp) mutableState.getValue()).m7292unboximpl(), 0.0f, ChaloTheme.d(composerStartRestartGroup, 0).c, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, null, false, null, null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-583898782, true, new xo0(fB, premiumBusStopDetailsViewState, function1, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 896) | 6, 1572870, 63634);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 6, premiumBusStopDetailsViewState, bottomSheetScaffoldState, function1));
        }
    }

    public static final void e(final Modifier modifier, final PremiumBusStopDetailsViewState state, final Function1 sendIntent, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(state, "state");
        PBStopDetailsMapState pBStopDetailsMapState = state.e;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1223253206);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223253206, i2, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMapContent (PBStopDetailsMainScreen.kt:319)");
            }
            if (pBStopDetailsMapState == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: vo0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                PBStopDetailsMainScreenKt.e(modifier, state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                PBStopDetailsMainScreenKt.e(modifier, state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierZIndex = ZIndexModifierKt.zIndex(boxScopeInstance.align(PaddingKt.m784padding3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f), companion.getTopStart()), 10.0f);
                boolean z = (i2 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new qm0(sendIntent, 22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloCircularBackButtonKt.a(modifierZIndex, 0L, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                ChaloMap_androidKt.b(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), EmptyList.f17557a, false, pBStopDetailsMapState.b, pBStopDetailsMapState.f7937a, null, null, false, null, null, null, null, composerStartRestartGroup, 54, 0, 4068);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            function2 = new Function2() { // from class: vo0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            PBStopDetailsMainScreenKt.e(modifier, state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            PBStopDetailsMainScreenKt.e(modifier, state, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void f(int i, PagerState pagerState, Composer composer, Modifier modifier, List stopSectionList, CoroutineScope scope) {
        int i2;
        Intrinsics.i(stopSectionList, "stopSectionList");
        Intrinsics.i(pagerState, "pagerState");
        Intrinsics.i(scope, "scope");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1905067937);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(stopSectionList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(pagerState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(scope) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1905067937, i2, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsTabs (PBStopDetailsMainScreen.kt:292)");
            }
            composerStartRestartGroup.startReplaceGroup(-1114212156);
            List list = stopSectionList;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(StringResourcesHelperKt.c(((PBStopDetailsMainScreenStopSectionType) it.next()).getTitleResId(), new Object[0], composerStartRestartGroup, 0));
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2 >> 3;
            ChaloScrollableTabRowKt.a(arrayList, pagerState, scope, modifier, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, ComposableLambdaKt.rememberComposableLambda(-1348830521, true, new wo0(pagerState, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 9) & 7168) | (i3 & 896) | (i3 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r80(modifier, stopSectionList, pagerState, scope, i, 1));
        }
    }
}
