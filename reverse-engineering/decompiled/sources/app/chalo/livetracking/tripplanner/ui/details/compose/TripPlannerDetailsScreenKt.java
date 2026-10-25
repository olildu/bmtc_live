package app.chalo.livetracking.tripplanner.ui.details.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.HomeOverscrollEffect_androidKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.CircularShapeKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.insets.PlatformInsets_androidKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsBottomSheetType;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsMapUiModel;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerPurchaseHooksUiState;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegSectionKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.cg1;
import defpackage.cn;
import defpackage.dq;
import defpackage.dt0;
import defpackage.ey0;
import defpackage.fl1;
import defpackage.gf;
import defpackage.h01;
import defpackage.hn0;
import defpackage.ic;
import defpackage.jl1;
import defpackage.kl1;
import defpackage.pk0;
import defpackage.q50;
import defpackage.qb1;
import defpackage.rj1;
import defpackage.sh1;
import defpackage.tt0;
import defpackage.uc;
import defpackage.v21;
import defpackage.w8;
import defpackage.xj1;
import defpackage.zc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/unit/Dp;", "bottomSheetPeekHeight", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerDetailsScreenKt {
    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[PHI: r7
      0x0089: PHI (r7v19 int) = (r7v0 int), (r7v5 int), (r7v6 int) binds: [B:50:0x0087, B:60:0x009f, B:59:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x010e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0114  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void a(final IconType iconType, final String str, final String str2, final String str3, final int i, Modifier modifier, IconType iconType2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int iOrdinal;
        boolean z;
        Composer composer2;
        final IconType iconType3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        IconType iconType4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1354571963);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i7 = i3 & 32;
        if (i7 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            i6 = 1572864;
            if (i5 == 0) {
                i4 |= i6;
            } else if ((1572864 & i2) == 0) {
                if (iconType2 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = iconType2.ordinal();
                }
                if (composerStartRestartGroup.changed(iOrdinal)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i5 != 0) {
                    iconType4 = IconType.BUS_NEARBY_UNSELECTED;
                } else {
                    iconType4 = iconType2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1354571963, i4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsAutoLegSection (TripPlannerDetailsScreen.kt:615)");
                }
                composer2 = composerStartRestartGroup;
                TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.AUTO, new Object[0], composerStartRestartGroup, 6), true, ComposableLambdaKt.rememberComposableLambda(-1058577622, true, new dt0(i, str2, str, str3, iconType4, 1), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, 3, null), 0L, composer2, (i4 & 14) | 3456, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                iconType3 = iconType4;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                iconType3 = iconType2;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: il1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        TripPlannerDetailsScreenKt.a(iconType, str, str2, str3, i, modifier3, iconType3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        modifier2 = modifier;
        i5 = i3 & 64;
        i6 = 1572864;
        if (i5 == 0) {
            i4 |= i6;
        } else if ((1572864 & i2) == 0) {
            if (iconType2 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = iconType2.ordinal();
            }
            if (composerStartRestartGroup.changed(iOrdinal)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        }
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            if (i7 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i5 != 0) {
                iconType4 = IconType.BUS_NEARBY_UNSELECTED;
            } else {
                iconType4 = iconType2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1354571963, i4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsAutoLegSection (TripPlannerDetailsScreen.kt:615)");
            }
            composer2 = composerStartRestartGroup;
            TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.AUTO, new Object[0], composerStartRestartGroup, 6), true, ComposableLambdaKt.rememberComposableLambda(-1058577622, true, new dt0(i, str2, str, str3, iconType4, 1), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, 3, null), 0L, composer2, (i4 & 14) | 3456, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            iconType3 = iconType4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            iconType3 = iconType2;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: il1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    TripPlannerDetailsScreenKt.a(iconType, str, str2, str3, i, modifier3, iconType3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(final Modifier modifier, final BottomSheetScaffoldState bottomSheetScaffoldState, final Function3 function3, final Shape shape, final float f, final Function3 function4, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-535186567);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-535186567, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsBottomSheet (TripPlannerDetailsScreen.kt:492)");
            }
            int i3 = i2 << 3;
            composer2 = composerStartRestartGroup;
            BottomSheetScaffoldKt.b(function3, modifier, bottomSheetScaffoldState, null, 0.0f, null, 0, false, shape, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, 0L, 0L, f, false, null, 0L, 0L, 0L, 0L, 0L, function4, composer2, ((i2 >> 6) & 14) | (i3 & 112) | (i3 & 896) | ((i2 << 18) & 1879048192), (i2 >> 3) & 7168, (i2 >> 9) & 896, 4184568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: hl1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    TripPlannerDetailsScreenKt.b(modifier, bottomSheetScaffoldState, function3, shape, f, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(TripPlannerDetailsState tripPlannerDetailsState, Function1 function1, float f, Modifier modifier, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1147467843);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tripPlannerDetailsState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1147467843, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsBottomSheetContent (TripPlannerDetailsScreen.kt:275)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float f2 = ChaloTheme.b(composerStartRestartGroup, 0).h;
            tripPlannerDetailsState.getClass();
            composerStartRestartGroup.startReplaceGroup(-581507547);
            composerStartRestartGroup.endReplaceGroup();
            List list = tripPlannerDetailsState.d;
            if (list == null || list.isEmpty()) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-581507547);
            } else {
                composerStartRestartGroup.startReplaceGroup(-569135354);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                Modifier modifierA = dq.a(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                PaddingValues paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m781PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7278constructorimpl(f2 + f), 7, null);
                OverscrollEffect overscrollEffectA = HomeOverscrollEffect_androidKt.a(composerStartRestartGroup);
                boolean zChangedInstance = ((57344 & i2) == 16384) | composerStartRestartGroup.changedInstance(tripPlannerDetailsState) | composerStartRestartGroup.changed(density) | ((i2 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    v21 v21Var = new v21(tripPlannerDetailsState, function2, density, function1, 6);
                    composerStartRestartGroup.updateRememberedValue(v21Var);
                    objRememberedValue = v21Var;
                }
                LazyDslKt.LazyColumn(modifierA, null, paddingValuesM781PaddingValuesa9UjIt4$default, false, null, null, null, false, overscrollEffectA, (Function1) objRememberedValue, composerStartRestartGroup, 0, 250);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tt0(tripPlannerDetailsState, function1, f, modifier, function2, i));
        }
    }

    public static final void d(int i, int i2, Composer composer, Modifier modifier, String str, String str2) {
        String str3;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1637364321);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1637364321, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsBottomSheetHeader (TripPlannerDetailsScreen.kt:451)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            DividerKt.m1949Divider9IZ8Weo(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).n), ChaloTheme.b(composerStartRestartGroup, 0).c, ChaloTheme.a(composerStartRestartGroup, 0).S, composerStartRestartGroup, 0, 0);
            TripPlannerResultsScreenKt.j(str3, i4, str2, PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).h), null, composerStartRestartGroup, i3 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q50(str, i, str2, modifier, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void e(IconType iconType, Function1 function1, TripPlannerLegUiModel.Bus bus, String str, int i, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Object obj;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(367185478);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(bus) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            obj = str;
            i4 |= composerStartRestartGroup.changed(obj) ? 2048 : 1024;
        } else {
            obj = str;
        }
        if ((i2 & 24576) == 0) {
            i5 = i;
            i4 |= composerStartRestartGroup.changed(i5) ? 16384 : 8192;
        } else {
            i5 = i;
        }
        int i7 = i3 & 32;
        if (i7 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i6 = i4;
            if ((74899 & i6) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i6 & 1)) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(367185478, i6, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsBusLegSection (TripPlannerDetailsScreen.kt:552)");
                }
                TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.BOARD_AT, new Object[]{bus.e}, composerStartRestartGroup, 6), true, ComposableLambdaKt.rememberComposableLambda(1079704683, true, new h01(i5, 26, function1, bus, obj), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, 3, null), 0L, composerStartRestartGroup, (i6 & 14) | 3456, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ic(iconType, function1, bus, str, i, modifier3, i2, i3));
            }
        }
        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        modifier2 = modifier;
        i6 = i4;
        if ((74899 & i6) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i6 & 1)) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(367185478, i6, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsBusLegSection (TripPlannerDetailsScreen.kt:552)");
            }
            TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.BOARD_AT, new Object[]{bus.e}, composerStartRestartGroup, 6), true, ComposableLambdaKt.rememberComposableLambda(1079704683, true, new h01(i5, 26, function1, bus, obj), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, 3, null), 0L, composerStartRestartGroup, (i6 & 14) | 3456, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ic(iconType, function1, bus, str, i, modifier3, i2, i3));
        }
    }

    public static final void f(float f, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1505593219);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1505593219, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsCombinedBuyTicketFooter (TripPlannerDetailsScreen.kt:419)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).c, ChaloTheme.a(composerStartRestartGroup, 0).A, composerStartRestartGroup, 6, 0);
            ChaloFilledButtonKt.g(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h), StringResourcesHelperKt.c(StringEnum.BUY_TICKET, new Object[0], composerStartRestartGroup, 6), null, 0L, null, false, 0.0f, null, 0L, function0, composerStartRestartGroup, (i2 << 24) & 1879048192, TypedValues.PositionType.TYPE_CURVE_FIT);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn0(f, function0, modifier, i, 1));
        }
    }

    public static final void g(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1246841760);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1246841760, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsDestinationSection (TripPlannerDetailsScreen.kt:507)");
            }
            Modifier modifierHeight = IntrinsicKt.height(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(modifier, Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).d + ChaloTheme.b(composerStartRestartGroup, 0).b), ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 12, null), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), IntrinsicSize.Min);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierAlign = rowScopeInstance.align(SizeKt.wrapContentSize$default(companion3, null, false, 3, null), companion.getCenterVertically());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CircularShapeKt.a(ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).c, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).e, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ROUTE_DETAILS_YOUR_DESTINATION, new Object[0], composerStartRestartGroup, 6), PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(rowScopeInstance.align(companion3, companion.getCenterVertically()), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).j, 0.0f, 0.0f, 0.0f, 14, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 384, 126968);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 29));
        }
    }

    public static final void h(IconType iconType, int i, Modifier modifier, IconType iconType2, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(156763858);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType2 == null ? -1 : iconType2.ordinal()) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(156763858, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsLegacyLegSection (TripPlannerDetailsScreen.kt:709)");
            }
            TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.TAKE, new Object[0], composerStartRestartGroup, 6), true, ComposableLambdaKt.rememberComposableLambda(1503488781, true, new jl1(i, iconType2), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, 3, null), 0L, composerStartRestartGroup, (i3 & 14) | 3456, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kl1(iconType, i, modifier, iconType2, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(BottomSheetScaffoldState bottomSheetScaffoldState, final TripPlannerDetailsState tripPlannerDetailsState, final Function1 function1, Composer composer, int i) {
        int i2;
        TripPlannerDetailsState tripPlannerDetailsState2;
        Function1 function2;
        Composer composer2;
        float fM7278constructorimpl;
        BottomSheetScaffoldState bottomSheetScaffoldState2 = bottomSheetScaffoldState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1215536426);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(bottomSheetScaffoldState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(tripPlannerDetailsState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1215536426, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsMainContent (TripPlannerDetailsScreen.kt:180)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(463476235, 0, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.rememberTripPlannerDetailsFooterBottomInset (TripPlannerDetailsFooterInset.android.kt:7)");
            }
            float fA = PlatformInsets_androidKt.a(0, composerStartRestartGroup, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (tripPlannerDetailsState.e instanceof TripPlannerPurchaseHooksUiState.ResolvedCombined) {
                composerStartRestartGroup.startReplaceGroup(1176737407);
                fM7278constructorimpl = Dp.m7278constructorimpl(Dp.m7278constructorimpl(Dp.m7278constructorimpl(Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).c + ChaloTheme.b(composerStartRestartGroup, 0).h) + ChaloTheme.b(composerStartRestartGroup, 0).n) + ChaloTheme.b(composerStartRestartGroup, 0).h) + fA);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1176922477);
                fM7278constructorimpl = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
                composerStartRestartGroup.endReplaceGroup();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            float fB = ComposeUtils_androidKt.b(composerStartRestartGroup);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Dp.m7276boximpl(fB);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final float fM7292unboximpl = ((Dp) objRememberedValue2).m7292unboximpl();
            final float f = fM7278constructorimpl;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            tripPlannerDetailsState2 = tripPlannerDetailsState;
            function2 = function1;
            composer2 = composerStartRestartGroup;
            bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            b(companion2, bottomSheetScaffoldState2, ComposableLambdaKt.rememberComposableLambda(1080943874, true, new Function3() { // from class: gl1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope TripPlannerDetailsBottomSheet = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(TripPlannerDetailsBottomSheet, "$this$TripPlannerDetailsBottomSheet");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1080943874, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsMainContent.<anonymous>.<anonymous> (TripPlannerDetailsScreen.kt:207)");
                        }
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new mc(fM7292unboximpl, mutableState);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        TripPlannerDetailsScreenKt.c(tripPlannerDetailsState, function1, f, companion5, (Function2) objRememberedValue3, composer3, 27648);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 12, null), ((Dp) mutableState.getValue()).m7292unboximpl(), ComposableLambdaKt.rememberComposableLambda(42070968, true, new qb1(8, tripPlannerDetailsState2, function2), composerStartRestartGroup, 54), composer2, ((i3 << 3) & 112) | 196998);
            if (!(tripPlannerDetailsState2.e instanceof TripPlannerPurchaseHooksUiState.ResolvedCombined) || bottomSheetScaffoldState2.f4447a.c.getValue() == BottomSheetValue.Collapsed) {
                composer2.startReplaceGroup(170482206);
            } else {
                composer2.startReplaceGroup(180822411);
                Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getBottomCenter());
                boolean z = (i3 & 896) == 256;
                Object objRememberedValue3 = composer2.rememberedValue();
                if (z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new rj1(function2, 2);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                f(fA, (Function0) objRememberedValue3, modifierAlign, composer2, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            tripPlannerDetailsState2 = tripPlannerDetailsState;
            function2 = function1;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 25, bottomSheetScaffoldState2, tripPlannerDetailsState2, function2));
        }
    }

    public static final void j(IconType iconType, Function1 function1, TripPlannerLegUiModel.Metro metro, int i, Modifier modifier, Composer composer, int i2) {
        int i3;
        long jM4615unboximpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(1063407315);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(metro) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1063407315, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsMetroLegSection (TripPlannerDetailsScreen.kt:681)");
            }
            String strC = StringResourcesHelperKt.c(StringEnum.BOARD_AT, new Object[]{metro.e}, composerStartRestartGroup, 6);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1474536754, true, new cg1(function1, metro, i, 17), composerStartRestartGroup, 54);
            Color colorM4595boximpl = null;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, 3, null);
            String str = metro.t;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(289451783);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(289451784);
                long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, str, ChaloTheme.a(composerStartRestartGroup, 0).e);
                composerStartRestartGroup.endReplaceGroup();
                colorM4595boximpl = Color.m4595boximpl(jA);
            }
            if (colorM4595boximpl == null) {
                composerStartRestartGroup.startReplaceGroup(-267754632);
                jM4615unboximpl = ChaloTheme.a(composerStartRestartGroup, 0).e;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-267758259);
                composerStartRestartGroup.endReplaceGroup();
                jM4615unboximpl = colorM4595boximpl.m4615unboximpl();
            }
            TripPlannerDefaultLegSectionKt.a(iconType, strC, true, composableLambdaRememberComposableLambda, modifierAnimateContentSize$default, jM4615unboximpl, composerStartRestartGroup, (i3 & 14) | 3456, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc(iconType, function1, metro, i, modifier, i2, 12));
        }
    }

    public static final void k(BottomSheetScaffoldState bottomSheetScaffoldState, SheetState sheetState, TripPlannerDetailsState tripPlannerDetailsState, Function1 function1, Composer composer, int i) {
        int i2;
        SheetState sheetState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1734255274);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sheetState2 = sheetState;
            i2 |= composerStartRestartGroup.changed(sheetState2) ? 32 : 16;
        } else {
            sheetState2 = sheetState;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(tripPlannerDetailsState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1734255274, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreen (TripPlannerDetailsScreen.kt:126)");
            }
            int i3 = i2 >> 3;
            i(bottomSheetScaffoldState, tripPlannerDetailsState, function1, composerStartRestartGroup, (i2 & 14) | (i3 & 112) | (i3 & 896));
            TripPlannerDetailsBottomSheetType tripPlannerDetailsBottomSheetType = tripPlannerDetailsState.h;
            if (tripPlannerDetailsBottomSheetType == null) {
                composerStartRestartGroup.startReplaceGroup(-1036788795);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1036788794);
                boolean z = (i2 & 7168) == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new rj1(function1, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloRoundedBottomSheetKt.a(sheetState2, (Function0) objRememberedValue, false, false, false, ComposableLambdaKt.rememberComposableLambda(-967957476, true, new qb1(7, tripPlannerDetailsBottomSheetType, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 196992, 24);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 11, bottomSheetScaffoldState, sheetState, tripPlannerDetailsState, function1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(TripPlannerDetailsComponent tripPlannerDetailsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1636053469);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tripPlannerDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1636053469, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenMain (TripPlannerDetailsScreen.kt:92)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(tripPlannerDetailsComponent.t0(), composerStartRestartGroup);
            BottomSheetScaffoldState bottomSheetScaffoldStateC = BottomSheetScaffoldKt.c(BottomSheetScaffoldKt.d(BottomSheetValue.Expanded, composerStartRestartGroup), composerStartRestartGroup, 5);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            TripPlannerDetailsBottomSheetType tripPlannerDetailsBottomSheetType = ((TripPlannerDetailsState) mutableStateA.getValue()).h;
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(bottomSheetScaffoldStateC) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TripPlannerDetailsScreenKt$TripPlannerDetailsScreenMain$1$1(bottomSheetScaffoldStateC, sheetStateRememberModalBottomSheetState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(tripPlannerDetailsBottomSheetType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            TripPlannerDetailsState tripPlannerDetailsState = (TripPlannerDetailsState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(tripPlannerDetailsComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new sh1(tripPlannerDetailsComponent, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            k(bottomSheetScaffoldStateC, sheetStateRememberModalBottomSheetState, tripPlannerDetailsState, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(tripPlannerDetailsComponent, i, 0));
        }
    }

    public static final void m(IconType iconType, String str, String str2, String str3, int i, Modifier modifier, IconType iconType2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-664921228);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType2 == null ? -1 : iconType2.ordinal()) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-664921228, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsTaxiLegSection (TripPlannerDetailsScreen.kt:649)");
            }
            composer2 = composerStartRestartGroup;
            TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.TAXI, new Object[0], composerStartRestartGroup, 6), true, ComposableLambdaKt.rememberComposableLambda(-368926887, true, new dt0(i, str2, str, str3, iconType2, 2), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, 3, null), 0L, composer2, (i3 & 14) | 3456, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w8(iconType, str, str2, str3, i, modifier, iconType2, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0077 A[PHI: r10
      0x0077: PHI (r10v17 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:43:0x0075, B:53:0x008d, B:52:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void n(IconType iconType, String str, String str2, int i, Modifier modifier, IconType iconType2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int iOrdinal;
        boolean z;
        Modifier modifier3;
        IconType iconType3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1201080462);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if (i5 == 0) {
                i4 |= i6;
            } else if ((196608 & i2) == 0) {
                if (iconType2 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = iconType2.ordinal();
                }
                if (composerStartRestartGroup.changed(iOrdinal)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    iconType3 = IconType.BUS_NEARBY_UNSELECTED;
                } else {
                    iconType3 = iconType2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1201080462, i4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsWalkLegSection (TripPlannerDetailsScreen.kt:582)");
                }
                TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.WALK, new Object[0], composerStartRestartGroup, 6), false, ComposableLambdaKt.rememberComposableLambda(-269821139, true, new cn(i, iconType3, str2, str), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, 3, null), 0L, composerStartRestartGroup, (i4 & 14) | 3456, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                iconType3 = iconType2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ic(iconType, str, str2, i, modifier3, iconType3, i2, i3));
            }
        }
        i4 |= 24576;
        modifier2 = modifier;
        i5 = i3 & 32;
        i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if (i5 == 0) {
            i4 |= i6;
        } else if ((196608 & i2) == 0) {
            if (iconType2 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = iconType2.ordinal();
            }
            if (composerStartRestartGroup.changed(iOrdinal)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i4 |= i6;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                iconType3 = IconType.BUS_NEARBY_UNSELECTED;
            } else {
                iconType3 = iconType2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201080462, i4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsWalkLegSection (TripPlannerDetailsScreen.kt:582)");
            }
            TripPlannerDefaultLegSectionKt.a(iconType, StringResourcesHelperKt.c(StringEnum.WALK, new Object[0], composerStartRestartGroup, 6), false, ComposableLambdaKt.rememberComposableLambda(-269821139, true, new cn(i, iconType3, str2, str), composerStartRestartGroup, 54), AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, 3, null), 0L, composerStartRestartGroup, (i4 & 14) | 3456, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            iconType3 = iconType2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ic(iconType, str, str2, i, modifier3, iconType3, i2, i3));
        }
    }

    public static final void o(TripPlannerDetailsState tripPlannerDetailsState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1282940856);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tripPlannerDetailsState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1282940856, i2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerMapContent (TripPlannerDetailsScreen.kt:239)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(BoxScopeInstance.INSTANCE.align(PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), companion2.getTopStart()), 10.0f);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new rj1(function1, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloCircularBackButtonKt.a(modifierZIndex, 0L, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            TripPlannerDetailsMapUiModel tripPlannerDetailsMapUiModel = tripPlannerDetailsState.f;
            List list = tripPlannerDetailsMapUiModel.f4738a;
            boolean z2 = tripPlannerDetailsMapUiModel.b;
            MapCameraViewState mapCameraViewState = tripPlannerDetailsMapUiModel.c;
            List list2 = tripPlannerDetailsState.g;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new xj1(9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function2 = (Function1) objRememberedValue2;
            boolean z3 = i4 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new rj1(function1, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            ChaloMap_androidKt.b(modifierFillMaxSize$default2, list, z2, mapCameraViewState, list2, null, null, false, function2, (Function0) objRememberedValue3, null, null, composer2, 100663302, 0, 3296);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(tripPlannerDetailsState, function1, i, 18));
        }
    }
}
