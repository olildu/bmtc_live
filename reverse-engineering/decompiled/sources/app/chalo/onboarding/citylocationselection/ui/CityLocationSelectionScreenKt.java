package app.chalo.onboarding.citylocationselection.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.PermissionsRationaleDialogKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.GenericErrorScreenComponentKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.bp;
import defpackage.c6;
import defpackage.dq;
import defpackage.fj;
import defpackage.gb;
import defpackage.i41;
import defpackage.ii;
import defpackage.ko;
import defpackage.m8;
import defpackage.mk;
import defpackage.pk0;
import defpackage.qg;
import defpackage.rb;
import defpackage.s4;
import defpackage.u6;
import defpackage.ue;
import defpackage.y4;
import defpackage.zc;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionState;", "viewState", "onboarding_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CityLocationSelectionScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6597a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[CityLocationSelectionLayoutType.values().length];
            try {
                iArr[CityLocationSelectionLayoutType.LocationPermission.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CityLocationSelectionLayoutType.NoCityAvailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CityLocationSelectionLayoutType.FetchError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CityLocationSelectionLayoutType.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CityLocationSelectionLayoutType.CityWelcome.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CityLocationSelectionLayoutType.ConfigFetchFailed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6597a = iArr;
            int[] iArr2 = new int[IconType.values().length];
            try {
                iArr2[IconType.KSRTC_LOGO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IconType.GURUGRAM_LOGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[CityLocationSelectionSource.values().length];
            try {
                iArr3[CityLocationSelectionSource.LoginScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CityLocationSelectionSource.LanguageSelectionScreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CityLocationSelectionSource.SplashScreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CityLocationSelectionSource.HomeScreen.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CityLocationSelectionSource.RegularBusScreen.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CityLocationSelectionSource.CityDiscontinuedScreen.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CityLocationSelectionSource.OldCitySelectionScreen.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CityLocationSelectionSource.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            c = iArr3;
        }
    }

    public static final void a(boolean z, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(283183766);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(283183766, i2, -1, "app.chalo.onboarding.citylocationselection.ui.AskLocationPermissionScreen (CityLocationSelectionScreen.kt:319)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m786paddingVpY3zN4$default(dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ChaloSpacersKt.b(ChaloTheme.b(composerStartRestartGroup, 0).W, composerStartRestartGroup, 0);
            i(z, composerStartRestartGroup, i2 & 14);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            int i5 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ONBOARDING_LOCATION_SHARE_TITLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composerStartRestartGroup, 0).getLabelLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 131066);
            ChaloSpacersKt.b(ChaloTheme.b(composerStartRestartGroup, 0).W, composerStartRestartGroup, 0);
            h(composerStartRestartGroup, 0, StringResourcesHelperKt.c(StringEnum.ONBOARDING_LOCATION_PERMISSION_BENEFIT_1, new Object[0], composerStartRestartGroup, 6));
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            h(composerStartRestartGroup, 0, StringResourcesHelperKt.c(StringEnum.ONBOARDING_LOCATION_PERMISSION_BENEFIT_2, new Object[0], composerStartRestartGroup, 6));
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            h(composerStartRestartGroup, 0, StringResourcesHelperKt.c(StringEnum.ONBOARDING_LOCATION_PERMISSION_BENEFIT_3, new Object[0], composerStartRestartGroup, 6));
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g), ChaloTheme.a(composerStartRestartGroup, 0).Z, ChaloTheme.a(composerStartRestartGroup, 0).H0, composerStartRestartGroup, 0, 0);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).B;
            String strC = StringResourcesHelperKt.c(StringEnum.ONBOARDING_LOCATION_ENABLE_DEVICE_LOCATION_CTA, new Object[0], composerStartRestartGroup, 6);
            int i6 = i5 & 896;
            boolean z2 = i6 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new bp(function1, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierM786paddingVpY3zN4$default, strC, null, 0L, null, false, 0.0f, null, j, (Function0) objRememberedValue, composerStartRestartGroup, 0, 252);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            long j2 = ChaloTheme.a(composerStartRestartGroup, 0).x;
            String strC2 = StringResourcesHelperKt.c(StringEnum.ONBOARDING_LOCATION_ENTER_MANUALLY_CTA, new Object[0], composerStartRestartGroup, 6);
            boolean z3 = i6 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new bp(function1, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloFilledButtonKt.f(strC2, false, modifierM786paddingVpY3zN4$default2, null, null, 0.0f, j2, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 58);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new y4(z, modifier, function1, i, 1));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Modifier modifier2;
        Function0 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1614029197);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1614029197, i2, -1, "app.chalo.onboarding.citylocationselection.ui.CityFetchErrorScreen (CityLocationSelectionScreen.kt:516)");
            }
            modifier2 = modifier;
            function1 = function0;
            GenericErrorScreenComponentKt.a(modifier2, null, false, function1, composerStartRestartGroup, (i2 & 14) | ((i2 << 6) & 7168), 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            function1 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier2, function1, i, 5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(CityLocationSelectionComponent cityLocationSelectionComponent, Composer composer, int i) {
        int i2;
        CityLocationSelectionComponent cityLocationSelectionComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1216548988);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cityLocationSelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1216548988, i2, -1, "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreen (CityLocationSelectionScreen.kt:73)");
            }
            CityLocationSelectionState cityLocationSelectionState = (CityLocationSelectionState) SubscribeAsStateKt.a(cityLocationSelectionComponent.t0(), composerStartRestartGroup).getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(cityLocationSelectionComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                cityLocationSelectionComponent2 = cityLocationSelectionComponent;
                CityLocationSelectionScreenKt$CityLocationSelectionScreen$1$1 cityLocationSelectionScreenKt$CityLocationSelectionScreen$1$1 = new CityLocationSelectionScreenKt$CityLocationSelectionScreen$1$1(1, cityLocationSelectionComponent2, CityLocationSelectionComponent.class, "processIntent", "processIntent(Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(cityLocationSelectionScreenKt$CityLocationSelectionScreen$1$1);
                objRememberedValue = cityLocationSelectionScreenKt$CityLocationSelectionScreen$1$1;
            } else {
                cityLocationSelectionComponent2 = cityLocationSelectionComponent;
            }
            d(cityLocationSelectionState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            cityLocationSelectionComponent2 = cityLocationSelectionComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(cityLocationSelectionComponent2, i, 13));
        }
    }

    public static final void d(CityLocationSelectionState cityLocationSelectionState, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(1780974203);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cityLocationSelectionState) : composerStartRestartGroup.changedInstance(cityLocationSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1780974203, i4, -1, "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreen (CityLocationSelectionScreen.kt:86)");
            }
            boolean z2 = cityLocationSelectionState.f6599a;
            CityLocationSelectionLayoutType cityLocationSelectionLayoutType = cityLocationSelectionState.c;
            CityLocationSelectionSource cityLocationSelectionSource = cityLocationSelectionState.b;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1271645827);
                i3 = 1267783847;
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                i3 = 1267783847;
                composerStartRestartGroup.startReplaceGroup(1267783847);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (cityLocationSelectionState.h) {
                composerStartRestartGroup.startReplaceGroup(1271740966);
                String strC = StringResourcesHelperKt.c(StringEnum.LOCATION_PERMISSION_PROMPT, new Object[0], composerStartRestartGroup, 6);
                int i5 = i4 & 112;
                boolean z3 = i5 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new bp(function1, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean z4 = i5 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new bp(function1, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                PermissionsRationaleDialogKt.a(strC, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(i3);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChanged = composerStartRestartGroup.changed(cityLocationSelectionSource.ordinal()) | composerStartRestartGroup.changed(cityLocationSelectionLayoutType.ordinal());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                switch (WhenMappings.c[cityLocationSelectionSource.ordinal()]) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        switch (WhenMappings.f6597a[cityLocationSelectionLayoutType.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                z = true;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    case 1:
                    case 2:
                    case 3:
                        z = false;
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue3).booleanValue();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceGroup(216074374);
                ChaloToolBarKt.a(null, null, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, 0L, null, null, composerStartRestartGroup, 0, 59);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(211443377);
            }
            composerStartRestartGroup.endReplaceGroup();
            e(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), cityLocationSelectionState, function1, composerStartRestartGroup, (i4 << 3) & 1008);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(cityLocationSelectionState, function1, i, 29));
        }
    }

    public static final void e(Modifier modifier, CityLocationSelectionState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1966404026);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1966404026, i2, -1, "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionUI (CityLocationSelectionScreen.kt:138)");
            }
            CityLocationSelectionLayoutType cityLocationSelectionLayoutType = viewState.c;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ko(28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AnimatedContentKt.AnimatedContent(cityLocationSelectionLayoutType, modifier, (Function1) objRememberedValue, null, "", null, ComposableLambdaKt.rememberComposableLambda(1202733807, true, new rb(3, viewState, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 112) | 1597824, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 26, modifier, viewState, sendIntent));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void f(Modifier modifier, String str, String str2, WelcomeScreenConfig welcomeScreenConfig, Composer composer, int i) {
        int i2;
        Modifier modifierM814height3ABfNKs;
        int i3;
        int i4;
        Intrinsics.i(welcomeScreenConfig, "welcomeScreenConfig");
        Composer composerStartRestartGroup = composer.startRestartGroup(886545085);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(welcomeScreenConfig) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886545085, i2, -1, "app.chalo.onboarding.citylocationselection.ui.CityWelcomeScreen (CityLocationSelectionScreen.kt:233)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            IconType iconType = welcomeScreenConfig.f6601a;
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(-2039107476);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
                i4 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(-2039107475);
                int i6 = WhenMappings.b[iconType.ordinal()];
                if (i6 == 1) {
                    composerStartRestartGroup.startReplaceGroup(-1408789695);
                    modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).m);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i6 != 2) {
                    composerStartRestartGroup.startReplaceGroup(2032778615);
                    modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).m);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1408637733);
                    modifierM814height3ABfNKs = SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).G), ChaloTheme.b(composerStartRestartGroup, 0).A);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i3 = 0;
                i4 = 1;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), (String) null, modifierM814height3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                ChaloSpacersKt.g(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            CardKt.Card(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, i3).d0), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(112)), null, CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(Dp.m7278constructorimpl(i3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-632592219, i4, new c6(welcomeScreenConfig, 13), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
            ChaloSpacersKt.g(composerStartRestartGroup, i3);
            StringEnum stringEnum = StringEnum.WELCOME_TO;
            Object[] objArr = new Object[i4];
            objArr[i3] = str;
            String strC = StringResourcesHelperKt.c(stringEnum, objArr, composerStartRestartGroup, 6);
            TextStyle textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, i3));
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleE, composerStartRestartGroup, 0, 0, 130046);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.t(composerStartRestartGroup, i3);
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(-2036757397);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2036757396);
                TextKt.m2623TextNvy7gAk(str2, SizeKt.fillMaxWidth(companion2, 0.9f), ChaloTheme.a(composerStartRestartGroup, i3).v0, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, i3)), composerStartRestartGroup, 48, 0, 130040);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(modifier, str, str2, welcomeScreenConfig, i, 14));
        }
    }

    public static final void g(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-320162445);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-320162445, i2, -1, "app.chalo.onboarding.citylocationselection.ui.GradientSeparator (CityLocationSelectionScreen.kt:526)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierA = i41.a(rowScopeInstance, SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).b), 1.0f, false, 2, null);
            Brush.Companion companion3 = Brush.INSTANCE;
            BoxKt.Box(BackgroundKt.background$default(modifierA, Brush.Companion.m4558horizontalGradient8A3gB4$default(companion3, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).p0), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).o0)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            ChaloSpacersKt.x(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.OR_CAPS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.x(composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.background$default(i41.a(rowScopeInstance, SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).b), 1.0f, false, 2, null), Brush.Companion.m4558horizontalGradient8A3gB4$default(companion3, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).o0), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).p0)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 4));
        }
    }

    public static final void h(Composer composer, int i, String str) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(392194439);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(392194439, i2, -1, "app.chalo.onboarding.citylocationselection.ui.LocationPermissionBenefitRow (CityLocationSelectionScreen.kt:424)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Brush.Companion.m4560linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).O0), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).Z)), 0L, 0L, 0, 14, (Object) null), ChaloTheme.d(composerStartRestartGroup, 0).f, 0.0f, 4, null), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).g);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.CHECK_CIRCLE, composerStartRestartGroup, 6), (String) null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).W), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, ChaloColorTokenKt.c(ChaloColorToken.AlmostBlackColor.f9756a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composer2, i2 & 14, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str, i, 5));
        }
    }

    public static final void i(boolean z, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1224185381);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224185381, i2, -1, "app.chalo.onboarding.citylocationselection.ui.LocationPermissionTopPlaceholder (CityLocationSelectionScreen.kt:405)");
            }
            ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(LottieType.CITY_LOCATION_PERMISSION_GIF, composerStartRestartGroup, 6), Integer.MAX_VALUE, z, composerStartRestartGroup, ((i2 << 6) & 896) | 48, 24), (String) null, ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).g)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m8(z, i, 2));
        }
    }

    public static final void j(Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(836687194);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(836687194, i4, -1, "app.chalo.onboarding.citylocationselection.ui.NoCityAvailableScreen (CityLocationSelectionScreen.kt:463)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.UNSUPPORTED_CITY, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.UNSUPPORTED_CITY, new Object[0], composerStartRestartGroup, 6), columnScopeInstance.align(companion3, companion.getCenterHorizontally()), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130044);
            ChaloSpacersKt.j(composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).B;
            String strC = StringResourcesHelperKt.c(StringEnum.CHANGE_LOCATION, new Object[0], composerStartRestartGroup, 6);
            int i7 = i4 & 112;
            boolean z = i7 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ii(function1, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default2, strC, null, 0L, null, false, 0.0f, null, j, (Function0) objRememberedValue, composerStartRestartGroup, 6, 252);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 6);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            String strC2 = StringResourcesHelperKt.c(StringEnum.EXPLORE_CHALO_CITIES, new Object[0], composerStartRestartGroup, 6);
            boolean z2 = i7 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                function2 = function1;
                objRememberedValue2 = new bp(function2, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                function2 = function1;
            }
            i3 = 1;
            ChaloFilledButtonKt.f(strC2, false, modifierFillMaxWidth$default3, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 384, 122);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            i3 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ue(modifier, function2, i, i3));
        }
    }
}
