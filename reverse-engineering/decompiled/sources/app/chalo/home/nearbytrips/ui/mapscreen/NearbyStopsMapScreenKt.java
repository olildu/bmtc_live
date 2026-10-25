package app.chalo.home.nearbytrips.ui.mapscreen;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.extractor.WavUtil;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.chalomap.ChaloMapOverlayConfig;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsDataInfo;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.utils.SheetDefaultsHelperKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.fk0;
import defpackage.gj;
import defpackage.h0;
import defpackage.i41;
import defpackage.ir;
import defpackage.kb;
import defpackage.lf;
import defpackage.nm0;
import defpackage.pk0;
import defpackage.u1;
import defpackage.xd;
import defpackage.zc;
import defpackage.zk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "moreRoutesText", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NearbyStopsMapScreenKt {
    public static final void a(List list, MapCameraViewState mapCameraViewState, ChaloMapOverlayConfig chaloMapOverlayConfig, String str, boolean z, boolean z2, Modifier modifier, Function0 function0, Function1 function1, Function0 function2, Function1 function3, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        Function1 function4;
        int i4;
        Modifier modifier2;
        float f;
        Function0 function5 = function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-708820931);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(mapCameraViewState) : composerStartRestartGroup.changedInstance(mapCameraViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chaloMapOverlayConfig) : composerStartRestartGroup.changedInstance(chaloMapOverlayConfig) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        int i5 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function4 = function1;
            i5 |= composerStartRestartGroup.changedInstance(function4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            function4 = function1;
        }
        if ((i & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i5 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-708820931, i5, i4, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapContent (NearbyStopsMapScreen.kt:322)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getBottomEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EmptyList.f17557a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list2 = (List) objRememberedValue;
            List list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((NearbyStopsDataAndMarkerHolder) it.next()).b);
            }
            int i7 = i5 << 6;
            int i8 = i5 >> 24;
            ChaloMap_androidKt.b(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), list2, z3, mapCameraViewState, arrayList, null, chaloMapOverlayConfig, false, function3, function0, function4, null, composerStartRestartGroup, ((i5 >> 6) & 896) | (i7 & 7168) | ((i5 << 12) & 3670016) | (234881024 & (i4 << 24)) | (i7 & 1879048192), i8 & 14, 2208);
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1009688920);
                b(boxScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 13, null), Alignment.INSTANCE.getTopCenter()), composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1022477505);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(383080846);
                f = ChaloTheme.b(composerStartRestartGroup, 0).u;
            } else {
                composerStartRestartGroup.startReplaceGroup(383081964);
                f = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
            }
            composerStartRestartGroup.endReplaceGroup();
            function5 = function2;
            c(PaddingKt.m781PaddingValuesa9UjIt4$default(0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).h + f), 3, null), function5, composerStartRestartGroup, i8 & 112);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nm0(list, mapCameraViewState, chaloMapOverlayConfig, str, z, z2, modifier2, function0, function1, function5, function3, i, i2));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(150777256);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(150777256, i2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapLoadingComponent (NearbyStopsMapScreen.kt:383)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.LOADING_STOPS_BANNER, new Object[0], composerStartRestartGroup, 6), PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloTheme.a(composerStartRestartGroup, 0).l0, RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).e), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 130040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 12));
        }
    }

    public static final void c(PaddingValues paddingValues, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1035421028);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035421028, i2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapMyLocationButton (NearbyStopsMapScreen.kt:368)");
            }
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.MY_LOCATION_HOMESCREEN, composerStartRestartGroup, 6), (String) null, ClickableKt.m299clickableoSLSa3U$default(ClipKt.clip(PaddingKt.padding(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m4640getTransparent0d7_KjU(), null, 2, null), paddingValues), RoundedCornerShapeKt.getCircleShape()), false, null, null, null, function0, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(paddingValues, function0, i, 7));
        }
    }

    public static final void d(final NearbyStopsMapState nearbyStopsMapState, BottomSheetScaffoldState bottomSheetScaffoldState, final Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        float f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-231103265);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(nearbyStopsMapState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-231103265, i2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreen (NearbyStopsMapScreen.kt:108)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = nearbyStopsMapState.i;
            boolean z = (nearbyStopAndTripsUiModel != null ? nearbyStopAndTripsUiModel.b : null) != null;
            if ((nearbyStopAndTripsUiModel != null ? nearbyStopAndTripsUiModel.b : null) != null) {
                composerStartRestartGroup.startReplaceGroup(1248116170);
                f = ChaloTheme.b(composerStartRestartGroup, 0).u;
            } else {
                composerStartRestartGroup.startReplaceGroup(1248117288);
                f = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
            }
            composerStartRestartGroup.endReplaceGroup();
            final int i3 = 0;
            final int i4 = 1;
            composer2 = composerStartRestartGroup;
            BottomSheetScaffoldKt.m1663BottomSheetScaffoldsdMYb0k(ComposableLambdaKt.rememberComposableLambda(1095819246, true, new Function3() { // from class: om0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list;
                    switch (i3) {
                        case 0:
                            ColumnScope BottomSheetScaffold = (ColumnScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Intrinsics.i(BottomSheetScaffold, "$this$BottomSheetScaffold");
                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1095819246, iIntValue, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreen.<anonymous> (NearbyStopsMapScreen.kt:112)");
                                }
                                NearbyStopsMapState nearbyStopsMapState2 = nearbyStopsMapState;
                                if (nearbyStopsMapState2.i != null) {
                                    composer3.startReplaceGroup(-495183699);
                                    NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel2 = nearbyStopsMapState2.i;
                                    Function1 function2 = function1;
                                    boolean zChanged = composer3.changed(function2);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new nu(function2, 23);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function3 = (Function1) objRememberedValue;
                                    boolean zChanged2 = composer3.changed(function2);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new xd(function2, 5);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function2 function4 = (Function2) objRememberedValue2;
                                    boolean zChanged3 = composer3.changed(function2);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new nu(function2, 24);
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    NearbyStopsMapScreenKt.g(nearbyStopAndTripsUiModel2, null, function3, function4, (Function1) objRememberedValue3, composer3, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-494337771);
                                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).f1916a, composer3, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            PaddingValues it = (PaddingValues) obj;
                            Composer composer4 = (Composer) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            Intrinsics.i(it, "it");
                            if (composer4.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1031511108, iIntValue2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreen.<anonymous> (NearbyStopsMapScreen.kt:147)");
                                }
                                NearbyStopsMapState nearbyStopsMapState3 = nearbyStopsMapState;
                                NearbyStopsDataInfo nearbyStopsDataInfo = nearbyStopsMapState3.e;
                                if (nearbyStopsDataInfo == null || (list = nearbyStopsDataInfo.b) == null) {
                                    list = EmptyList.f17557a;
                                }
                                MapCameraViewState mapCameraViewState = nearbyStopsMapState3.g;
                                ChaloMapOverlayConfig chaloMapOverlayConfig = nearbyStopsMapState3.j;
                                NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel3 = nearbyStopsMapState3.i;
                                String str = nearbyStopAndTripsUiModel3 != null ? nearbyStopAndTripsUiModel3.b : null;
                                boolean z2 = nearbyStopsMapState3.f;
                                boolean z3 = nearbyStopsMapState3.f3165a;
                                Function1 function5 = function1;
                                boolean zChanged4 = composer4.changed(function5);
                                Object objRememberedValue4 = composer4.rememberedValue();
                                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new qm0(function5, 1);
                                    composer4.updateRememberedValue(objRememberedValue4);
                                }
                                Function0 function0 = (Function0) objRememberedValue4;
                                boolean zChanged5 = composer4.changed(function5);
                                Object objRememberedValue5 = composer4.rememberedValue();
                                if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new nu(function5, 21);
                                    composer4.updateRememberedValue(objRememberedValue5);
                                }
                                Function1 function6 = (Function1) objRememberedValue5;
                                boolean zChanged6 = composer4.changed(function5);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new wg0(function5, 29);
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                Function0 function7 = (Function0) objRememberedValue6;
                                boolean zChanged7 = composer4.changed(function5);
                                Object objRememberedValue7 = composer4.rememberedValue();
                                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new nu(function5, 22);
                                    composer4.updateRememberedValue(objRememberedValue7);
                                }
                                NearbyStopsMapScreenKt.a(list, mapCameraViewState, chaloMapOverlayConfig, str, z2, z3, null, function0, function6, function7, (Function1) objRememberedValue7, composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), modifierFillMaxSize$default, bottomSheetScaffoldState, f, 0.0f, ChaloTheme.d(composerStartRestartGroup, 0).f1919a, 0L, 0L, 0.0f, 0.0f, null, z, ComposableLambdaKt.rememberComposableLambda(-350822139, true, new xd(function1, 4), composerStartRestartGroup, 54), null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(1031511108, true, new Function3() { // from class: om0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list;
                    switch (i4) {
                        case 0:
                            ColumnScope BottomSheetScaffold = (ColumnScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Intrinsics.i(BottomSheetScaffold, "$this$BottomSheetScaffold");
                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1095819246, iIntValue, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreen.<anonymous> (NearbyStopsMapScreen.kt:112)");
                                }
                                NearbyStopsMapState nearbyStopsMapState2 = nearbyStopsMapState;
                                if (nearbyStopsMapState2.i != null) {
                                    composer3.startReplaceGroup(-495183699);
                                    NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel2 = nearbyStopsMapState2.i;
                                    Function1 function2 = function1;
                                    boolean zChanged = composer3.changed(function2);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new nu(function2, 23);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function3 = (Function1) objRememberedValue;
                                    boolean zChanged2 = composer3.changed(function2);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new xd(function2, 5);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function2 function4 = (Function2) objRememberedValue2;
                                    boolean zChanged3 = composer3.changed(function2);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new nu(function2, 24);
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    NearbyStopsMapScreenKt.g(nearbyStopAndTripsUiModel2, null, function3, function4, (Function1) objRememberedValue3, composer3, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-494337771);
                                    gf.r(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).f1916a, composer3, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            PaddingValues it = (PaddingValues) obj;
                            Composer composer4 = (Composer) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            Intrinsics.i(it, "it");
                            if (composer4.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1031511108, iIntValue2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreen.<anonymous> (NearbyStopsMapScreen.kt:147)");
                                }
                                NearbyStopsMapState nearbyStopsMapState3 = nearbyStopsMapState;
                                NearbyStopsDataInfo nearbyStopsDataInfo = nearbyStopsMapState3.e;
                                if (nearbyStopsDataInfo == null || (list = nearbyStopsDataInfo.b) == null) {
                                    list = EmptyList.f17557a;
                                }
                                MapCameraViewState mapCameraViewState = nearbyStopsMapState3.g;
                                ChaloMapOverlayConfig chaloMapOverlayConfig = nearbyStopsMapState3.j;
                                NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel3 = nearbyStopsMapState3.i;
                                String str = nearbyStopAndTripsUiModel3 != null ? nearbyStopAndTripsUiModel3.b : null;
                                boolean z2 = nearbyStopsMapState3.f;
                                boolean z3 = nearbyStopsMapState3.f3165a;
                                Function1 function5 = function1;
                                boolean zChanged4 = composer4.changed(function5);
                                Object objRememberedValue4 = composer4.rememberedValue();
                                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new qm0(function5, 1);
                                    composer4.updateRememberedValue(objRememberedValue4);
                                }
                                Function0 function0 = (Function0) objRememberedValue4;
                                boolean zChanged5 = composer4.changed(function5);
                                Object objRememberedValue5 = composer4.rememberedValue();
                                if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new nu(function5, 21);
                                    composer4.updateRememberedValue(objRememberedValue5);
                                }
                                Function1 function6 = (Function1) objRememberedValue5;
                                boolean zChanged6 = composer4.changed(function5);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new wg0(function5, 29);
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                Function0 function7 = (Function0) objRememberedValue6;
                                boolean zChanged7 = composer4.changed(function5);
                                Object objRememberedValue7 = composer4.rememberedValue();
                                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new nu(function5, 22);
                                    composer4.updateRememberedValue(objRememberedValue7);
                                }
                                NearbyStopsMapScreenKt.a(list, mapCameraViewState, chaloMapOverlayConfig, str, z2, z3, null, function0, function6, function7, (Function1) objRememberedValue7, composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composer2, ((i2 << 3) & 896) | 54, 1573254, 58320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 29, nearbyStopsMapState, bottomSheetScaffoldState, function1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(NearbyStopsMapComponent nearbyStopsMapComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1001816906);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(nearbyStopsMapComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001816906, i2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenMain (NearbyStopsMapScreen.kt:68)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(nearbyStopsMapComponent.t0(), composerStartRestartGroup);
            BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(SheetDefaultsHelperKt.a(false, null, SheetValue.Hidden, false, composerStartRestartGroup, 3456, 51), null, composerStartRestartGroup, 0, 2);
            boolean zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState) | composerStartRestartGroup.changedInstance(nearbyStopsMapComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$1$1(bottomSheetScaffoldStateRememberBottomSheetScaffoldState, nearbyStopsMapComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(bottomSheetScaffoldStateRememberBottomSheetScaffoldState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            Boolean boolValueOf = Boolean.valueOf(((NearbyStopsMapState) mutableStateA.getValue()).n);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$2$1(bottomSheetScaffoldStateRememberBottomSheetScaffoldState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            NearbyStopsMapState nearbyStopsMapState = (NearbyStopsMapState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nearbyStopsMapComponent);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$3$1 nearbyStopsMapScreenKt$NearbyStopsMapScreenMain$3$1 = new NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$3$1(1, nearbyStopsMapComponent, NearbyStopsMapComponent.class, "processIntent", "processIntent(Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(nearbyStopsMapScreenKt$NearbyStopsMapScreenMain$3$1);
                objRememberedValue3 = nearbyStopsMapScreenKt$NearbyStopsMapScreenMain$3$1;
            }
            d(nearbyStopsMapState, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, (Function1) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(nearbyStopsMapComponent, i, 2));
        }
    }

    public static final void f(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-700361847);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-700361847, i2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenToolbar (NearbyStopsMapScreen.kt:176)");
            }
            ChaloToolBarKt.a(ComposableSingletons$NearbyStopsMapScreenKt.f3138a, null, 0.0f, 0L, ComposableLambdaKt.rememberComposableLambda(1151574526, true, new gj(function0, 1), composerStartRestartGroup, 54), null, composerStartRestartGroup, 24582, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 9, function0));
        }
    }

    public static final void g(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, Modifier modifier, Function1 function1, Function2 function2, Function1 function3, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1161257154);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(nearbyStopAndTripsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1161257154, i3, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapSelectedStopBottomSheetContent (NearbyStopsMapScreen.kt:206)");
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2480SurfaceT9BRK9s(PaddingKt.m784padding3ABfNKs(AnimationModifierKt.animateContentSize$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).A, null, 2, null), null, null, 3, null), ChaloTheme.b(composerStartRestartGroup, 0).h), null, 0L, 0L, ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1111006183, true, new u1(nearbyStopAndTripsUiModel, function1, function3, function2, companion), composerStartRestartGroup, 54), composer2, 12582912, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) nearbyStopAndTripsUiModel, modifier2, (Object) function1, (Object) function2, (Object) function3, i, 20));
        }
    }

    public static final void h(int i, Composer composer, Modifier modifier, List list) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(617209507);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(list) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(617209507, i2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMoreRoutesButtonContent (NearbyStopsMapScreen.kt:235)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((StopTripDetailsUiModel) it.next()).d);
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new NearbyStopsMapScreenKt$NearbyStopsMoreRoutesButtonContent$2$1(list, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(arrayList, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            final TextStyle textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0));
            final String strC = StringResourcesHelperKt.c(StringEnum.MORE_BUSES, new Object[0], composerStartRestartGroup, 6);
            final long j = ChaloTheme.a(composerStartRestartGroup, 0).i;
            final long j2 = ChaloTheme.a(composerStartRestartGroup, 0).g;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: pm0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str = strC;
                        MutableState mutableState2 = mutableState;
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        TextStyle textStyle = textStyleH;
                        int iPushStyle = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(textStyle.toSpanStyle(), j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
                        try {
                            builder.append(str);
                            builder.append(" ");
                            builder.pop(iPushStyle);
                            int iPushStyle2 = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(textStyle.toSpanStyle(), j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
                            try {
                                builder.append((String) mutableState2.getValue());
                                return builder.toAnnotatedString();
                            } finally {
                                builder.pop(iPushStyle2);
                            }
                        } catch (Throwable th) {
                            builder.pop(iPushStyle);
                            throw th;
                        }
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AnnotatedString annotatedString = (AnnotatedString) ((State) objRememberedValue3).getValue();
            int iM7226getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.m2624TextZ58ophY(annotatedString, i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, iM7226getEllipsisgIe3tQ8, false, 1, 0, null, null, null, composerStartRestartGroup, 0, 24960, 503804);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NEARBY_TRIP_CARD_MORE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).K, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lf(list, modifier, i));
        }
    }
}
