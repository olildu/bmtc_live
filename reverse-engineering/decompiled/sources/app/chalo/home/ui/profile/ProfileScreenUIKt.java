package app.chalo.home.ui.profile;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnVisibilityChangedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.userprofile.domain.AccountSettingsAction;
import defpackage.ar0;
import defpackage.cb;
import defpackage.ey0;
import defpackage.fr0;
import defpackage.fu0;
import defpackage.fy0;
import defpackage.gy0;
import defpackage.hq0;
import defpackage.i41;
import defpackage.lh;
import defpackage.lx0;
import defpackage.ob;
import defpackage.pk0;
import defpackage.r1;
import defpackage.rh;
import defpackage.rx0;
import defpackage.wl;
import defpackage.wm0;
import defpackage.xq0;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isBannerMarkedShown", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProfileScreenUIKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3603a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AccountSettingsAction.values().length];
            try {
                iArr[AccountSettingsAction.LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSettingsAction.DELETE_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3603a = iArr;
            int[] iArr2 = new int[ProfilePageItemDisplayType.values().length];
            try {
                iArr2[ProfilePageItemDisplayType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProfilePageItemDisplayType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProfilePageItemDisplayType.PLOTLINE_WIDGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProfilePageItemDisplayType.DIVIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProfilePageItemDisplayType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public static final void a(int i, Composer composer, List list, Function0 function0, Function1 function1) {
        Composer composer2;
        IconType iconType;
        char c;
        String strC;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(879840311);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(879840311, i3, -1, "app.chalo.home.ui.profile.AccountSettingsBottomSheetContent (ProfileScreenUI.kt:168)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ACCOUNT_SETTINGS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).P0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, 1572864, 0, 131002);
            int i6 = i3;
            int i7 = 48;
            int i8 = i6;
            Object obj = null;
            int i9 = 256;
            int i10 = 2;
            float f = 0.0f;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CLOSE, composerStartRestartGroup, 6), "close_account_settings_sheet", ClickableKt.m299clickableoSLSa3U$default(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), false, null, null, null, function0, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            int i11 = 0;
            int i12 = 1;
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, 0).i), 0.0f, 1, null), composer2, 0);
            composer2.startReplaceGroup(-1887220436);
            int i13 = 0;
            for (Object obj2 : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                AccountSettingsAction accountSettingsAction = (AccountSettingsAction) obj2;
                int i15 = i13;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, f, i12, obj);
                int i16 = (composer2.changed(accountSettingsAction.ordinal()) ? 1 : 0) | ((i8 & 896) == i9 ? i12 : i11);
                Object objRememberedValue = composer2.rememberedValue();
                if (i16 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fr0(20, function1, accountSettingsAction);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composer2, i11).h, ChaloTheme.b(composer2, i11).h);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, i7);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i11);
                int i17 = i8;
                int i18 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM785paddingVpY3zN4);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i18), composerM3915constructorimpl3));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int[] iArr = WhenMappings.f3603a;
                int i19 = iArr[accountSettingsAction.ordinal()];
                if (i19 == i12) {
                    iconType = IconType.IC_LOGOUT;
                } else {
                    if (i19 != i10) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iconType = IconType.IC_DELETE;
                }
                Painter painterA = PainterResourceHelperKt.a(iconType, composer2, 0);
                String lowerCase = accountSettingsAction.name().toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                int i20 = i12;
                Composer composer3 = composer2;
                ImageKt.Image(painterA, "account_settings_action_".concat(lowerCase), SizeKt.m814height3ABfNKs(companion4, Dp.m7278constructorimpl(ChaloTheme.b(composer2, 0).g + ChaloTheme.b(composer2, 0).e)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, Painter.$stable, 120);
                ChaloSpacersKt.x(composer3, 0);
                int i21 = iArr[accountSettingsAction.ordinal()];
                if (i21 == i20) {
                    c = 6;
                    composer3.startReplaceGroup(1506951915);
                    strC = StringResourcesHelperKt.c(StringEnum.LOGOUT, new Object[0], composer3, 6);
                    composer3.endReplaceGroup();
                } else {
                    if (i21 != 2) {
                        throw pk0.p(composer3, 1506949811);
                    }
                    composer3.startReplaceGroup(1506955059);
                    c = 6;
                    strC = StringResourcesHelperKt.c(StringEnum.DELETE_ACCOUNT, new Object[0], composer3, 6);
                    composer3.endReplaceGroup();
                }
                TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composer3, 0).P0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, 0).getBodyLarge(), composer3, 0, 0, 131066);
                composer2 = composer3;
                composer2.endNode();
                if (i15 != CollectionsKt.K(list)) {
                    composer2.startReplaceGroup(-605234815);
                    i2 = 2;
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer2, 0).b), 0.0f, i20, null), ChaloTheme.b(composer2, 0).i, 0.0f, 2, null), ChaloTheme.a(composer2, 0).s0, null, 2, null), composer2, 0);
                } else {
                    i2 = 2;
                    composer2.startReplaceGroup(-615169292);
                }
                composer2.endReplaceGroup();
                i11 = 0;
                i10 = i2;
                i13 = i14;
                i8 = i17;
                i9 = 256;
                i7 = 48;
                obj = null;
                i12 = i20;
                f = 0.0f;
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.m(composer2, i11);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rh(list, function0, function1, i));
        }
    }

    public static final void b(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(320839987);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(320839987, i2, -1, "app.chalo.home.ui.profile.ChangeEnvironmentSectionFooter (ProfileScreenUI.kt:642)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lx0(function1, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CHANGE_ENVIRONMENT_SMALL, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge(), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, 7, function1));
        }
    }

    public static final void c(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(47220465);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47220465, i, -1, "app.chalo.home.ui.profile.HomeDrawerUserProfilingNudgeBanner (ProfileScreenUI.kt:508)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(ChaloColorToken.CapeHoneyYellow.f9774a)), Color.m4595boximpl(ChaloColorTokenKt.c(ChaloColorToken.White.f9870a))), 0.0f, 0.0f, 0, 14, (Object) null), ChaloThemeKt.d(UIShape.e), 0.0f, 4, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 4, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new xq0(mutableState, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnVisibilityChanged$default = OnVisibilityChangedModifierKt.onVisibilityChanged$default(modifierM788paddingqDBjuR0$default, 0L, 0.0f, null, (Function1) objRememberedValue2, 7, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnVisibilityChanged$default);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(new ImageUIState(IconType.PARTY_POPPER, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloTheme.b(composerStartRestartGroup, 0).k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.x(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.USER_PROFILING_HOME_DRAWER_BANNER_TITLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge(), composer2, 0, 0, 131066);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.THIS_WILL_HELP_US_IMPROVE_YOUR_EXPERIENCE, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).P0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer2, 0, 0, 131066);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 15));
        }
    }

    public static final void d(Modifier modifier, Function1 function1, ProfilePageDisplayItemData profilePageDisplayItemData, int i, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        fy0 fy0Var;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1024612574);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(profilePageDisplayItemData) : composerStartRestartGroup.changedInstance(profilePageDisplayItemData) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1024612574, i3, -1, "app.chalo.home.ui.profile.ProfileDrawerCardItemUI (ProfileScreenUI.kt:408)");
            }
            ProfileDrawerCardData profileDrawerCardData = profilePageDisplayItemData.h;
            if (profileDrawerCardData == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    fy0Var = new fy0(modifier2, function1, profilePageDisplayItemData, i, i2, 3);
                }
            } else {
                function2 = function1;
                boolean z = ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(profilePageDisplayItemData))) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new gy0(profilePageDisplayItemData, function2, i, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloRoundedCardKt.b(PaddingKt.m788paddingqDBjuR0$default(modifier, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-247976157, true, new ob(19, (Function0) objRememberedValue, profilePageDisplayItemData, profileDrawerCardData), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(fy0Var);
        }
        function2 = function1;
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            fy0Var = new fy0(modifier, function2, profilePageDisplayItemData, i, i2, 4);
            scopeUpdateScopeEndRestartGroup.updateScope(fy0Var);
        }
    }

    public static final void e(Modifier modifier, Function1 function1, ProfilePageDisplayItemData profilePageDisplayItemData, int i, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        fy0 fy0Var;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1260842748);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(profilePageDisplayItemData) : composerStartRestartGroup.changedInstance(profilePageDisplayItemData) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1260842748, i4, -1, "app.chalo.home.ui.profile.ProfilePageCardItemUI (ProfileScreenUI.kt:360)");
            }
            if (profilePageDisplayItemData.f != ProfilePageFeature.PROFILE || profilePageDisplayItemData.h == null) {
                composerStartRestartGroup.startReplaceGroup(2003586686);
                composerStartRestartGroup.endReplaceGroup();
                IconType iconType = profilePageDisplayItemData.c;
                if (iconType == null) {
                    composerStartRestartGroup.startReplaceGroup(2018531351);
                } else {
                    composerStartRestartGroup.startReplaceGroup(2018531352);
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(modifier, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, 2, null);
                    String str = profilePageDisplayItemData.f3593a;
                    String str2 = profilePageDisplayItemData.b;
                    boolean z = ((i4 & 896) == 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(profilePageDisplayItemData))) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new gy0(profilePageDisplayItemData, function1, i, 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ChaloWidgetCardKt.d(modifierM788paddingqDBjuR0$default, str, null, str2, null, iconType, 0.0f, 0.0f, null, 0.0f, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 0, 2004);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(2018300092);
                d(modifier2, function1, profilePageDisplayItemData, i, composerStartRestartGroup, i4 & 8190);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    fy0Var = new fy0(modifier, function1, profilePageDisplayItemData, i, i2, 0);
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(fy0Var);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            fy0Var = new fy0(modifier, function1, profilePageDisplayItemData, i, i2, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(fy0Var);
        }
    }

    public static final void f(Modifier modifier, Function1 function1, ProfilePageDisplayItemData profilePageDisplayItemData, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifierPadding;
        Composer composerStartRestartGroup = composer.startRestartGroup(1404685494);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(profilePageDisplayItemData) : composerStartRestartGroup.changedInstance(profilePageDisplayItemData) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1404685494, i3, -1, "app.chalo.home.ui.profile.ProfilePageListItemUI (ProfileScreenUI.kt:565)");
            }
            IconType iconType = profilePageDisplayItemData.c;
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(1119413933);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1119413934);
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(profilePageDisplayItemData))) | ((i3 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new gy0(profilePageDisplayItemData, function1, i, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (!(composerStartRestartGroup.getApplier() != null)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0);
                ChaloPadding chaloPadding = profilePageDisplayItemData.e;
                if (chaloPadding == null || (modifierPadding = PaddingKt.padding(companion, ChaloThemeKt.e(chaloPadding))) == null) {
                    modifierPadding = companion;
                }
                ImageKt.Image(painterA, (String) null, SizeKt.m828size3ABfNKs(companion.then(modifierPadding), profilePageDisplayItemData.d), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                ChaloSpacersKt.x(composerStartRestartGroup, 0);
                String str = profilePageDisplayItemData.f3593a;
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(-487736429);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-487736428);
                    composer2 = composerStartRestartGroup;
                    TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge(), composer2, 0, 0, 131066);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fy0(modifier, function1, profilePageDisplayItemData, i, i2, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v41 */
    public static final void g(Function1 function1, String str, List list, boolean z, Composer composer, int i) {
        ProfilePageItemDisplayType profilePageItemDisplayType;
        int i2;
        boolean z2;
        int i3;
        ProfilePageItemDisplayType profilePageItemDisplayType2;
        Function1 function2 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-129460989);
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i5 = i4;
        int i6 = 1;
        int i7 = 0;
        if (composerStartRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-129460989, i5, -1, "app.chalo.home.ui.profile.ProfileScreenContent (ProfileScreenUI.kt:289)");
            }
            ?? r2 = 0;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(511274695);
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.z0();
                    throw r2;
                }
                ProfilePageDisplayItemData profilePageDisplayItemData = (ProfilePageDisplayItemData) obj;
                if (i9 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1329502450);
                    ChaloSpacersKt.s(r2, i7, composerStartRestartGroup, i6);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1317872025);
                }
                composerStartRestartGroup.endReplaceGroup();
                ProfilePageItemDisplayType profilePageItemDisplayType3 = profilePageDisplayItemData.g;
                int i11 = WhenMappings.b[profilePageItemDisplayType3.ordinal()];
                if (i11 == i6) {
                    profilePageItemDisplayType = profilePageItemDisplayType3;
                    i2 = 1317872025;
                    composerStartRestartGroup.startReplaceGroup(1329697161);
                    function2 = function1;
                    e(hq0.c("PL_Profile_Page_Card_Item_", i9, Modifier.INSTANCE), function2, profilePageDisplayItemData, i9, composerStartRestartGroup, (i5 << 3) & 112);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i11 != 2) {
                    profilePageItemDisplayType = profilePageItemDisplayType3;
                    if (i11 == 3) {
                        composerStartRestartGroup.startReplaceGroup(1330316231);
                        String str2 = profilePageDisplayItemData.f3593a;
                        if (str2 == null) {
                            composerStartRestartGroup.startReplaceGroup(1330316230);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1330316231);
                            PlotlineComposeWidgetKt.a(0, 2, composerStartRestartGroup, null, str2);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i11 == 4) {
                        composerStartRestartGroup.startReplaceGroup(1330476687);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composerStartRestartGroup, i7).r0, null, 2, null), 0.0f, i6, null), ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        profilePageItemDisplayType = profilePageItemDisplayType;
                        i2 = 1317872025;
                    } else {
                        if (i11 != 5) {
                            throw pk0.p(composerStartRestartGroup, 319986678);
                        }
                        composerStartRestartGroup.startReplaceGroup(1330817687);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i2 = 1317872025;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1329986825);
                    profilePageItemDisplayType = profilePageItemDisplayType3;
                    i2 = 1317872025;
                    f(hq0.c("PL_Profile_Page_List_Item_", i9, Modifier.INSTANCE), function2, profilePageDisplayItemData, i9, composerStartRestartGroup, (i5 << 3) & 112);
                    composerStartRestartGroup.endReplaceGroup();
                    function2 = function1;
                }
                if (i9 != CollectionsKt.K(list) && profilePageItemDisplayType == ProfilePageItemDisplayType.CARD && ((ProfilePageDisplayItemData) list.get(i10)).g == ProfilePageItemDisplayType.DIVIDER) {
                    composerStartRestartGroup.startReplaceGroup(1331074367);
                    ChaloSpacersKt.o(composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(i2);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (i9 != CollectionsKt.K(list) && profilePageItemDisplayType == (profilePageItemDisplayType2 = ProfilePageItemDisplayType.LIST) && ((ProfilePageDisplayItemData) list.get(i10)).g == profilePageItemDisplayType2) {
                    composerStartRestartGroup.startReplaceGroup(1331376555);
                    i3 = 0;
                    z2 = false;
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).b), 0.0f, i6, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).s0, null, 2, null), composerStartRestartGroup, 0);
                } else {
                    z2 = false;
                    i3 = 0;
                    composerStartRestartGroup.startReplaceGroup(i2);
                }
                composerStartRestartGroup.endReplaceGroup();
                i7 = i3;
                i9 = i10;
                i6 = 1;
                r2 = z2;
            }
            composerStartRestartGroup.endReplaceGroup();
            PlotlineComposeWidgetKt.a(6, 2, composerStartRestartGroup, r2, "appReferralBanner");
            int i12 = i5 & 14;
            k(function2, str, composerStartRestartGroup, i5 & WebSocketProtocol.PAYLOAD_SHORT);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1328019430);
                b(function2, composerStartRestartGroup, i12);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1341992215);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(function2, str, list, z, i, 10));
        }
    }

    public static final void h(ProfileScreenViewState profileScreenViewState, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Function1 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-727750787);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(profileScreenViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727750787, i2, -1, "app.chalo.home.ui.profile.ProfileScreenContentUI (ProfileScreenUI.kt:252)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(function0, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
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
            i(composerStartRestartGroup, 0);
            g(function2, profileScreenViewState.e, profileScreenViewState.f3614a, profileScreenViewState.f, composerStartRestartGroup, (i2 >> 3) & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 27, profileScreenViewState, function1, function0));
        }
    }

    public static final void i(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-970513829);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-970513829, i, -1, "app.chalo.home.ui.profile.ProfileScreenHeader (ProfileScreenUI.kt:276)");
            }
            ChaloToolBarKt.g(ChaloToolBarKt.l(Modifier.INSTANCE, composerStartRestartGroup), StringResourcesHelperKt.c(StringEnum.ACCOUNT, new Object[0], composerStartRestartGroup, 6), 0L, null, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 14));
        }
    }

    public static final void j(ProfileScreenViewState viewState, Function1 sendIntent, Function0 onBackPressed, SheetState modalBottomSheetState, Composer composer, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.i(viewState, "viewState");
        ProfileScreenBottomSheetType profileScreenBottomSheetType = viewState.b;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(onBackPressed, "onBackPressed");
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1577845842);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 2048 : 1024;
        }
        int i7 = i2;
        if (composerStartRestartGroup.shouldExecute((i7 & 1171) != 1170, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1577845842, i7, -1, "app.chalo.home.ui.profile.ProfileScreenUI (ProfileScreenUI.kt:76)");
            }
            if (Intrinsics.d(profileScreenBottomSheetType, ProfileScreenBottomSheetType.ChaloWalletIntroBottomSheet.f3595a) || (profileScreenBottomSheetType instanceof ProfileScreenBottomSheetType.AccountSettingsBottomSheet)) {
                z = false;
            } else {
                if (profileScreenBottomSheetType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            if (profileScreenBottomSheetType == null) {
                composerStartRestartGroup.startReplaceGroup(-1482887134);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1482887133);
                i3 = 0;
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, null, z, false, false, ComposableLambdaKt.rememberComposableLambda(594649482, true, new fu0(12, profileScreenBottomSheetType, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 9) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                composerStartRestartGroup.endReplaceGroup();
            }
            ProfileScreenDialogType profileScreenDialogType = viewState.c;
            if (profileScreenDialogType == null) {
                composerStartRestartGroup.startReplaceGroup(-1481387819);
                composerStartRestartGroup.endReplaceGroup();
                i4 = i3;
                i5 = i7;
                i6 = 32;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1481387818);
                if (profileScreenDialogType.equals(ProfileScreenDialogType.DeleteAccountConfirmation.f3598a)) {
                    composerStartRestartGroup.startReplaceGroup(1136654416);
                    String strC = StringResourcesHelperKt.c(StringEnum.DELETE_ACCOUNT_DIALOG_MSG, new Object[i3], composerStartRestartGroup, 6);
                    String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY_SMALL, new Object[i3], composerStartRestartGroup, 6);
                    int i8 = i7 & 112;
                    int i9 = i8 == 32 ? 1 : i3;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i9 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new lx0(sendIntent, 2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    String strC3 = StringResourcesHelperKt.c(StringEnum.CANCEL, new Object[i3], composerStartRestartGroup, 6);
                    int i10 = i8 == 32 ? 1 : i3;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i10 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new lx0(sendIntent, 4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function1 = (Function0) objRememberedValue2;
                    int i11 = i8 == 32 ? 1 : i3;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (i11 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new lx0(sendIntent, 5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function2 = (Function0) objRememberedValue3;
                    i5 = i7;
                    i6 = 32;
                    i4 = i3;
                    ChaloConfirmationDialogKt.b(null, strC, strC2, function0, strC3, function1, null, function2, composerStartRestartGroup, 0, 65);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i4 = i3;
                    if (!(profileScreenDialogType instanceof ProfileScreenDialogType.LogoutFailed)) {
                        throw pk0.p(composerStartRestartGroup, -1487356607);
                    }
                    composerStartRestartGroup.startReplaceGroup(1137471173);
                    String str = ((ProfileScreenDialogType.LogoutFailed) profileScreenDialogType).f3599a;
                    String strC4 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[i4], composerStartRestartGroup, 6);
                    int i12 = (i7 & 112) == 32 ? 1 : i4;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (i12 != 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new lx0(sendIntent, 6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function3 = (Function0) objRememberedValue4;
                    i5 = i7;
                    i6 = 32;
                    ChaloConfirmationDialogKt.b(null, str, strC4, function3, null, null, null, null, composerStartRestartGroup, 0, 241);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (viewState.d || viewState.i) {
                composerStartRestartGroup.startReplaceGroup(-1480037489);
                boolean z2 = viewState.i;
                int i13 = (i5 & 112) == i6 ? 1 : i4;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (i13 != 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new lx0(sendIntent, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                ChaloLoadingDialogKt.b(null, z2, (Function0) objRememberedValue5, composerStartRestartGroup, 0, 1);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1486775308);
            }
            composerStartRestartGroup.endReplaceGroup();
            h(viewState, sendIntent, onBackPressed, composerStartRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(viewState, sendIntent, onBackPressed, modalBottomSheetState, i, 1));
        }
    }

    public static final void k(Function1 function1, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1475921155);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1475921155, i2, -1, "app.chalo.home.ui.profile.TnCSectionFooterSection (ProfileScreenUI.kt:611)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lx0(function1, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TERMS_AND_CONDITIONS_SMALL, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge(), composer2, 0, 0, 131066);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
            TextKt.m2623TextNvy7gAk("V ".concat(str), null, ChaloTheme.a(composer2, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer2, 0, 0, 131066);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(function1, str, i, 3));
        }
    }
}
