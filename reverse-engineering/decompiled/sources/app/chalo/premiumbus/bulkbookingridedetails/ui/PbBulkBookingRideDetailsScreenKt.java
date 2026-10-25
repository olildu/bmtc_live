package app.chalo.premiumbus.bulkbookingridedetails.ui;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.OriginDestinationSideIndicatorKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.ui.stopselection.compose.FromAndToStopCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.af;
import defpackage.bf;
import defpackage.bg;
import defpackage.c0;
import defpackage.eq0;
import defpackage.f0;
import defpackage.fk0;
import defpackage.fq0;
import defpackage.gf;
import defpackage.h0;
import defpackage.h3;
import defpackage.h5;
import defpackage.i41;
import defpackage.kb;
import defpackage.kk;
import defpackage.nm0;
import defpackage.p80;
import defpackage.pk0;
import defpackage.q50;
import defpackage.qg;
import defpackage.qh;
import defpackage.r1;
import defpackage.sn0;
import defpackage.ut;
import defpackage.wb;
import defpackage.wl;
import defpackage.wm0;
import defpackage.xq0;
import defpackage.ym0;
import defpackage.zc;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewState;", "viewState", "Landroidx/compose/ui/unit/Dp;", "heightInDp", "", "isHeaderAtTop", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PbBulkBookingRideDetailsScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6915a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;

        static {
            int[] iArr = new int[PBPreBookingDetailsLayoutType.values().length];
            try {
                iArr[PBPreBookingDetailsLayoutType.FIRST_TIME_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PBPreBookingDetailsLayoutType.REGULAR_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6915a = iArr;
            int[] iArr2 = new int[BulkBookingRideDetailsScreenType.values().length];
            try {
                iArr2[BulkBookingRideDetailsScreenType.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BulkBookingRideDetailsScreenType.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BulkBookingRideDetailsScreenType.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[LinkedBookingLayoutType.values().length];
            try {
                iArr3[LinkedBookingLayoutType.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[LinkedBookingLayoutType.Initialize.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[LinkedBookingLayoutType.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[LinkedBookingLayoutType.Failure.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
            int[] iArr4 = new int[PbBulkBookingRideDetailsTabType.values().length];
            try {
                iArr4[PbBulkBookingRideDetailsTabType.UPCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[PbBulkBookingRideDetailsTabType.PAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            d = iArr4;
            int[] iArr5 = new int[LinkedBookingLocalDataFetchStateLayoutType.values().length];
            try {
                iArr5[LinkedBookingLocalDataFetchStateLayoutType.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[LinkedBookingLocalDataFetchStateLayoutType.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[LinkedBookingLocalDataFetchStateLayoutType.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            e = iArr5;
            int[] iArr6 = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr6[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.BOOKING_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.PAYMENT_PROCESSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.PAYMENT_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.USER_CANCELLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.SYSTEM_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.USER_RESCHEDULED.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.SYSTEM_RESCHEDULED.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.EXPIRED.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[PremiumReserveTicketStatus.FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            f = iArr6;
            int[] iArr7 = new int[BannerStatus.values().length];
            try {
                iArr7[BannerStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[BannerStatus.IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[BannerStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[BannerStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            g = iArr7;
        }
    }

    public static final void a(Composer composer, int i, String str) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(18813228);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(18813228, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloTextWithGreyBackgroundPill (PbBulkBookingRideDetailsScreen.kt:550)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, PaddingKt.m785paddingVpY3zN4(SizeKt.m814height3ABfNKs(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).A0, ChaloTheme.d(composerStartRestartGroup, 0).d), ChaloTheme.b(composerStartRestartGroup, 0).i), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).d), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composer2, i2 & 14, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str, i, 15));
        }
    }

    public static final void b(String str, String str2, int i, float f, float f2, Composer composer, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        float f3;
        float f4;
        float f5;
        int i5;
        float f6;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268144877);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str2;
            i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        int i7 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i7 = i3 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i7 |= 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                float f7 = ChaloTheme.b(composerStartRestartGroup, 0).f;
                f5 = ChaloTheme.b(composerStartRestartGroup, 0).b;
                i5 = i7 & (-64513);
                f6 = f7;
                i6 = 1;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f6 = f;
                f5 = f2;
                i5 = i7 & (-64513);
                i6 = i;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1268144877, i5, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.FromAndToStopComponent (PbBulkBookingRideDetailsScreen.kt:880)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierHeight = IntrinsicKt.height(companion, IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f8 = f5;
            OriginDestinationSideIndicatorKt.a(SizeKt.fillMaxHeight(companion, 0.8f), f6, f8, composerStartRestartGroup, 6, 0);
            float f9 = f6;
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            int i9 = i6;
            c(i9, (i5 << 3) & 8176, composerStartRestartGroup, null, str3, str4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = f8;
            i4 = i9;
            f3 = f9;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i4 = i;
            f3 = f;
            f4 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kk(str, str2, i4, f3, f4, i2, 1));
        }
    }

    public static final void c(int i, int i2, Composer composer, Modifier modifier, String str, String str2) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1220588539);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1220588539, i3, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.FromAndToStopNames (PbBulkBookingRideDetailsScreen.kt:905)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle bodyMedium = ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium();
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t0;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
            int i5 = (57344 & (i3 << 3)) | 384;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, i, 0, null, bodyMedium, composer2, ((i3 >> 3) & 14) | 48, i5, 110584);
            ChaloSpacersKt.t(composer2, 0);
            TextKt.m2623TextNvy7gAk(str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composer2, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, i, 0, null, ChaloTheme.e(composer2, 0).getBodyMedium(), composer2, ((i3 >> 6) & 14) | 48, i5, 110584);
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new q50(i, i2, 1, modifier2, str, str2));
        }
    }

    public static final void d(PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog passDateChangeConfirmationDialog, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1892614088);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(passDateChangeConfirmationDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1892614088, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PassDateChangeConfirmationDialog (PbBulkBookingRideDetailsScreen.kt:1281)");
            }
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-522019119, true, new h5(8, function1, passDateChangeConfirmationDialog, function0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 8, passDateChangeConfirmationDialog, function1, function0));
        }
    }

    public static final void e(PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog passDateChangeFailureDialog, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1733691775);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(passDateChangeFailureDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1733691775, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PassDateChangeFailureDialog (PbBulkBookingRideDetailsScreen.kt:1366)");
            }
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p80(function0, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1481557768, true, new h3(29, function0, passDateChangeFailureDialog), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(passDateChangeFailureDialog, function0, i, 2));
        }
    }

    public static final void f(Modifier modifier, final PbPassInfoBanner pbPassInfoBanner, final Function1 function1, Composer composer, int i) {
        int i2;
        long jC;
        long jC2;
        long jC3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1854042153);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(pbPassInfoBanner) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        final int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1854042153, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PassInfoBannerUI (PbBulkBookingRideDetailsScreen.kt:1482)");
            }
            int i4 = WhenMappings.g[pbPassInfoBanner.c.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                jC = ChaloColorTokenKt.c(ChaloColorToken.White.f9870a);
                ChaloColorToken.LightOrangeSpf lightOrangeSpf = ChaloColorToken.LightOrangeSpf.f9817a;
                jC2 = ChaloColorTokenKt.c(lightOrangeSpf);
                jC3 = ChaloColorTokenKt.c(lightOrangeSpf);
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ChaloColorToken.RedBase redBase = ChaloColorToken.RedBase.f9846a;
                jC = ChaloColorTokenKt.c(redBase);
                jC2 = ChaloColorTokenKt.c(redBase);
                jC3 = ChaloColorTokenKt.c(redBase);
            }
            Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.d(composerStartRestartGroup, 0).g), Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(jC), Color.m4595boximpl(jC2)), 0.0f, 0.0f, 0, 14, (Object) null), ChaloTheme.d(composerStartRestartGroup, 0).g, 0.0f, 4, null), ChaloTheme.b(composerStartRestartGroup, 0).b, jC3, ChaloTheme.d(composerStartRestartGroup, 0).g);
            boolean z = pbPassInfoBanner.e != null;
            int i5 = i2 & 896;
            int i6 = i2 & 112;
            boolean z2 = (i6 == 32) | (i5 == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: br0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                function1.invoke(pbPassInfoBanner.e);
                                break;
                            default:
                                function1.invoke(pbPassInfoBanner.e);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierM275borderxT4_qwU, z, null, null, null, (Function0) objRememberedValue, 14, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h);
            Painter painterA = PainterResourceHelperKt.a(pbPassInfoBanner.f6935a, composerStartRestartGroup, 0);
            int i10 = Painter.$stable;
            ImageKt.Image(painterA, "", modifierM828size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i10 | 48, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            boolean z3 = false;
            TextKt.m2623TextNvy7gAk(pbPassInfoBanner.b, null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (pbPassInfoBanner.d != null) {
                composerStartRestartGroup.startReplaceGroup(1637890388);
                ChaloSpacersKt.x(composerStartRestartGroup, 0);
                String str = pbPassInfoBanner.d;
                TextStyle titleLarge = ChaloTheme.e(composerStartRestartGroup, 0).getTitleLarge();
                Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composerStartRestartGroup, 6);
                long j = ChaloTheme.a(composerStartRestartGroup, 0).Z;
                long j2 = ChaloTheme.a(composerStartRestartGroup, 0).B;
                float f = ChaloTheme.b(composerStartRestartGroup, 0).d;
                boolean z4 = i5 == 256;
                if (i6 == 32) {
                    z3 = true;
                }
                boolean z5 = z4 | z3;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final int i11 = 1;
                    objRememberedValue2 = new Function0() { // from class: br0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    function1.invoke(pbPassInfoBanner.e);
                                    break;
                                default:
                                    function1.invoke(pbPassInfoBanner.e);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ChaloFilledButtonKt.c(str, null, titleLarge, painterA2, j, j2, f, (Function0) objRememberedValue2, composerStartRestartGroup, i10 << 9, 2);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1578265887);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(modifier, pbPassInfoBanner, function1, i, 10));
        }
    }

    public static final void g(Modifier modifier, final SuperPassResponseAppModel superPassResponseAppModel, String str, final String str2, final Integer num, final boolean z, final String str3, final boolean z2, final Function0 onBookSingleRideClick, final Function0 onRenewButtonClick, final Function1 onFaqClicked, Composer composer, int i, int i2) {
        int i3;
        String str4;
        int i4;
        Composer composer2;
        Intrinsics.i(superPassResponseAppModel, "superPassResponseAppModel");
        Intrinsics.i(onBookSingleRideClick, "onBookSingleRideClick");
        Intrinsics.i(onRenewButtonClick, "onRenewButtonClick");
        Intrinsics.i(onFaqClicked, "onFaqClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-26747003);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(superPassResponseAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str;
            i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBookSingleRideClick) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRenewButtonClick) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onFaqClicked) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-26747003, i3, i4, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBookNewRideCard (PbBulkBookingRideDetailsScreen.kt:583)");
            }
            SuperPassTripPreferences superPassTripPreferences = superPassResponseAppModel.j;
            String str5 = superPassTripPreferences != null ? superPassTripPreferences.c : null;
            String str6 = superPassTripPreferences != null ? superPassTripPreferences.e : null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).g;
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t;
            int i5 = CardDefaults.$stable;
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i5 << 12, 14);
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i5 << 18, 62);
            final String str7 = str5;
            final String str8 = str4;
            final String str9 = str6;
            CardKt.Card(modifierFillMaxWidth$default, shape, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(1865220947, true, new Function3() { // from class: vq0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str10;
                    Arrangement arrangement;
                    String str11;
                    ComposeUiNode.Companion companion;
                    char c;
                    Modifier.Companion companion2;
                    Integer num2;
                    Modifier.Companion companion3;
                    Arrangement arrangement2;
                    Modifier.Companion companion4;
                    char c2;
                    Modifier.Companion companion5;
                    int i6;
                    float f;
                    String str12;
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(Card, "$this$Card");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1865220947, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBookNewRideCard.<anonymous> (PbBulkBookingRideDetailsScreen.kt:594)");
                        }
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h);
                        Arrangement arrangement3 = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement3.getTop();
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion7.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM784padding3ABfNKs);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion8.getConstructor();
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
                        pk0.v(companion8, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        String str13 = str7;
                        String str14 = str9;
                        if (str13 == null || str13.length() == 0 || str14 == null || str14.length() == 0) {
                            str10 = str13;
                            arrangement = arrangement3;
                            str11 = str14;
                            companion = companion8;
                            c = 27685;
                            composer3.startReplaceGroup(513240101);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(539938138);
                            arrangement = arrangement3;
                            companion = companion8;
                            ImageKt.Image(PainterResourceHelperKt.a(IconType.CHALO_BUS_LOGO, composer3, 6), "", SizeKt.m814height3ABfNKs(companion6, ChaloTheme.b(composer3, 0).i), companion7.getTopStart(), ContentScale.INSTANCE.getInside(), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 27696, 96);
                            ChaloSpacersKt.m(composer3, 0);
                            PbBulkBookingRideDetailsScreenKt.b(str13, str14, 0, 0.0f, 0.0f, composer3, 0);
                            str10 = str13;
                            str11 = str14;
                            ChaloSpacersKt.o(composer3, 0);
                            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), ChaloTheme.b(composer3, 0).b), ChaloTheme.a(composer3, 0).s0, null, 2, null), composer3, 0);
                            ChaloSpacersKt.o(composer3, 0);
                            composer3.endReplaceGroup();
                            c = 27685;
                        }
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getCenterVertically(), composer3, 48);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                        ComposeUiNode.Companion companion9 = companion;
                        pk0.v(companion9, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PASS_FOR, new Object[0], composer3, 6), null, ChaloTheme.a(composer3, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, 0).getBodySmall(), composer3, 0, 0, 131066);
                        if (str10 == null || str10.length() == 0 || str11 == null || str11.length() == 0) {
                            composer3.startReplaceGroup(-1854020037);
                            companion2 = companion6;
                            SpacerKt.Spacer(i41.a(rowScopeInstance, companion6, 1.0f, false, 2, null), composer3, 0);
                            ImageKt.Image(PainterResourceHelperKt.a(IconType.CHALO_BUS_LOGO, composer3, 6), "", SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composer3, 0).i), (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 24624, 104);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1882075223);
                            composer3.endReplaceGroup();
                            companion2 = companion6;
                        }
                        composer3.endNode();
                        ChaloSpacersKt.t(composer3, 0);
                        SuperPassResponseAppModel superPassResponseAppModel2 = superPassResponseAppModel;
                        Modifier.Companion companion10 = companion2;
                        TextKt.m2623TextNvy7gAk(superPassResponseAppModel2.d, null, ChaloTheme.a(composer3, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, 0).getBodyMedium(), composer3, 0, 0, 131066);
                        ChaloSpacersKt.o(composer3, 0);
                        SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), ChaloTheme.b(composer3, 0).b), ChaloTheme.a(composer3, 0).s0, null, 2, null), composer3, 0);
                        ChaloSpacersKt.o(composer3, 0);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getTop(), composer3, 0);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default3);
                        Function0<ComposeUiNode> constructor3 = companion9.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion9, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
                        ComposeUiNode.Companion companion11 = companion9;
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VALIDITY, new Object[0], composer3, 6), null, ChaloTheme.a(composer3, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, 0).getBodySmall(), composer3, 0, 0, 131066);
                        Composer composer4 = composer3;
                        SpacerKt.Spacer(i41.a(rowScopeInstance, companion10, 1.0f, false, 2, null), composer4, 0);
                        Integer num3 = num;
                        if (num3 == null || num3.intValue() < 0) {
                            num2 = num3;
                            companion3 = companion10;
                            composer4.startReplaceGroup(1100538752);
                        } else {
                            composer4.startReplaceGroup(1129987915);
                            num2 = num3;
                            companion3 = companion10;
                            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.RIDES_LEFT, new Object[0], composer4, 6), null, ChaloTheme.a(composer4, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, 0).getBodySmall(), composer4, 0, 0, 131066);
                            composer4 = composer4;
                        }
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        String str15 = str8;
                        if (str15 == null || str15.length() == 0 || (str12 = str2) == null || str12.length() == 0) {
                            arrangement2 = arrangement;
                            companion4 = companion3;
                            c2 = 27685;
                            composer4.startReplaceGroup(513240101);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(543136780);
                            ChaloSpacersKt.t(composer4, 0);
                            Modifier.Companion companion12 = companion3;
                            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
                            Arrangement arrangement4 = arrangement;
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement4.m672spacedBy0680j_4(ChaloTheme.b(composer4, 0).h), companion7.getCenterVertically(), composer4, 48);
                            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default4);
                            Function0<ComposeUiNode> constructor4 = companion11.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor4);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion11, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl4, Integer.valueOf(i10), composerM3915constructorimpl4));
                            arrangement2 = arrangement4;
                            FlowLayoutKt.FlowRow(i41.a(rowScopeInstance, companion12, 1.0f, false, 2, null), null, null, companion7.getCenterVertically(), 0, 0, ComposableLambdaKt.rememberComposableLambda(-1522273950, true, new qf(str15, str12, 1), composer4, 54), composer4, 1575936, 54);
                            if (num2 == null || num2.intValue() < 0) {
                                companion4 = companion12;
                                companion11 = companion11;
                                composer4.startReplaceGroup(-1582729125);
                            } else {
                                composer4.startReplaceGroup(-1551458247);
                                Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion12, null, false, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion7.getTop(), composer4, 0);
                                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                int i11 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, modifierWrapContentWidth$default);
                                Function0<ComposeUiNode> constructor5 = companion11.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor5);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer4);
                                pk0.v(companion11, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl5, currentCompositionLocalMap5);
                                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl5, Integer.valueOf(i11), composerM3915constructorimpl5));
                                if (z2) {
                                    composer4.startReplaceGroup(-682622159);
                                    Composer composer5 = composer4;
                                    companion4 = companion12;
                                    companion11 = companion11;
                                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.UNLIMITED, new Object[0], composer4, 6), null, ChaloTheme.a(composer4, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, 0).getBodyMedium(), composer5, 0, 0, 131066);
                                    composer4 = composer5;
                                    composer4.endReplaceGroup();
                                } else {
                                    companion4 = companion12;
                                    composer4.startReplaceGroup(-682308873);
                                    Composer composer6 = composer4;
                                    TextKt.m2623TextNvy7gAk(String.valueOf(num2.intValue()), null, ChaloTheme.a(composer4, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, 0).getBodyMedium(), composer6, 0, 0, 131066);
                                    composer4 = composer6;
                                    Integer num4 = superPassResponseAppModel2.h;
                                    if (num4 == null) {
                                        companion11 = companion11;
                                        composer4.startReplaceGroup(-681963844);
                                    } else {
                                        companion11 = companion11;
                                        composer4.startReplaceGroup(-681963843);
                                        TextKt.m2623TextNvy7gAk(vo1.j(num4.intValue(), "/"), null, ChaloTheme.a(composer4, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, 0).getBodyMedium(), composer4, 0, 0, 131066);
                                        composer4 = composer4;
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endReplaceGroup();
                                }
                                composer4.endNode();
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            composer4.endReplaceGroup();
                            c2 = 27685;
                        }
                        ChaloSpacersKt.g(composer4, 0);
                        Modifier.Companion companion13 = companion4;
                        Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null);
                        String strC = StringResourcesHelperKt.c(StringEnum.BOOK_RIDE, new Object[0], composer4, 6);
                        boolean z3 = num2 != null && num2.intValue() > 0;
                        Shape shape2 = ChaloTheme.d(composer4, 0).g;
                        Function0 function0 = onBookSingleRideClick;
                        boolean zChanged = composer4.changed(function0);
                        Object objRememberedValue = composer4.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ar0(function0, 0);
                            composer4.updateRememberedValue(objRememberedValue);
                        }
                        Composer composer7 = composer4;
                        ChaloFilledButtonKt.g(modifierFillMaxWidth$default5, strC, null, 0L, shape2, z3, 0.0f, null, 0L, (Function0) objRememberedValue, composer7, 6, 460);
                        Composer composer8 = composer7;
                        if (z) {
                            composer8.startReplaceGroup(546294533);
                            ChaloSpacersKt.n(composer8, 0);
                            companion5 = companion13;
                            f = 0.0f;
                            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                            String strC2 = StringResourcesHelperKt.c(StringEnum.RENEW, new Object[0], composer8, 6);
                            Shape shape3 = ChaloTheme.d(composer8, 0).g;
                            Function0 function1 = onRenewButtonClick;
                            boolean zChanged2 = composer8.changed(function1);
                            Object objRememberedValue2 = composer8.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new ar0(function1, 1);
                                composer8.updateRememberedValue(objRememberedValue2);
                            }
                            ChaloFilledButtonKt.f(strC2, true, modifierFillMaxWidth$default6, null, shape3, 0.0f, 0L, (Function0) objRememberedValue2, composer8, 432, 104);
                            composer8 = composer8;
                            composer8.endReplaceGroup();
                            i6 = 513240101;
                        } else {
                            companion5 = companion13;
                            i6 = 513240101;
                            f = 0.0f;
                            composer8.startReplaceGroup(513240101);
                            composer8.endReplaceGroup();
                        }
                        String str16 = str3;
                        if (str16 == null || str16.length() == 0) {
                            composer8.startReplaceGroup(i6);
                        } else {
                            composer8.startReplaceGroup(546810311);
                            ChaloSpacersKt.n(composer8, 0);
                            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion5, f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getCenter(), companion7.getCenterVertically(), composer8, 54);
                            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                            int i12 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap6 = composer8.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxWidth$default7);
                            Function0<ComposeUiNode> constructor6 = companion11.getConstructor();
                            if (composer8.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer8.startReusableNode();
                            if (composer8.getInserting()) {
                                composer8.createNode(constructor6);
                            } else {
                                composer8.useNode();
                            }
                            Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer8);
                            ComposeUiNode.Companion companion14 = companion11;
                            pk0.v(companion14, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy5, composerM3915constructorimpl6, currentCompositionLocalMap6);
                            Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion14, composerM3915constructorimpl6, Integer.valueOf(i12), composerM3915constructorimpl6));
                            ImageKt.Image(PainterResourceHelperKt.a(IconType.ICON_HELP, composer8, 6), "", SizeKt.m828size3ABfNKs(companion5, ChaloTheme.b(composer8, 0).h), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer8, Painter.$stable | 48, 120);
                            ChaloSpacersKt.B(composer8, 0);
                            String strC3 = StringResourcesHelperKt.c(StringEnum.KNOW_YOUR_PASS_BENEFITS, new Object[0], composer8, 6);
                            TextStyle textStyleJ = ChaloTypographyKt.j(ChaloTheme.e(composer8, 0));
                            long j2 = ChaloTheme.a(composer8, 0).t0;
                            Function1 function2 = onFaqClicked;
                            boolean zChanged3 = composer8.changed(function2) | composer8.changed(str16);
                            Object objRememberedValue3 = composer8.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new w60(6, str16, function2);
                                composer8.updateRememberedValue(objRememberedValue3);
                            }
                            Composer composer9 = composer8;
                            TextKt.m2623TextNvy7gAk(strC3, ClickableKt.m299clickableoSLSa3U$default(companion5, false, null, null, null, (Function0) objRememberedValue3, 15, null), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleJ, composer9, 0, 0, 131064);
                            composer8 = composer9;
                            composer8.endNode();
                        }
                        composer8.endReplaceGroup();
                        composer8.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nm0(modifier, superPassResponseAppModel, str, str2, num, z, str3, z2, onBookSingleRideClick, onRenewButtonClick, onFaqClicked, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:101:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:110:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0310  */
    /* JADX WARN: Code duplicated, block: B:113:0x0320  */
    /* JADX WARN: Code duplicated, block: B:114:0x0332  */
    /* JADX WARN: Code duplicated, block: B:116:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0403  */
    /* JADX WARN: Code duplicated, block: B:122:0x0428  */
    /* JADX WARN: Code duplicated, block: B:127:0x0446  */
    /* JADX WARN: Code duplicated, block: B:130:0x045e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0466  */
    /* JADX WARN: Code duplicated, block: B:133:0x0481  */
    /* JADX WARN: Code duplicated, block: B:170:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x024f  */
    /* JADX WARN: Code duplicated, block: B:92:0x025b  */
    /* JADX WARN: Code duplicated, block: B:93:0x025f  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void h(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, Composer composer, int i) {
        int i2;
        Function1 function1;
        char c;
        ?? r15;
        Modifier.Companion companion;
        ComposeUiNode.Companion companion2;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        int i3;
        MutableState mutableState;
        Object obj;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        ?? r0;
        SuperPassResponseAppModel superPassResponseAppModel;
        ?? r1;
        Composer composerStartRestartGroup = composer.startRestartGroup(795419019);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(pbBulkBookingRideDetailsComponent) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(795419019, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComposable (PbBulkBookingRideDetailsScreen.kt:106)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(pbBulkBookingRideDetailsComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pbBulkBookingRideDetailsComponent);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ym0(pbBulkBookingRideDetailsComponent, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function2 = (Function1) objRememberedValue3;
            if (((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).p) {
                composerStartRestartGroup.startReplaceGroup(993697907);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(988054295);
            }
            composerStartRestartGroup.endReplaceGroup();
            PbBulkBookingRideDetailsDialogType pbBulkBookingRideDetailsDialogType = ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).u;
            int i9 = 5;
            if (pbBulkBookingRideDetailsDialogType instanceof PbBulkBookingRideDetailsDialogType.DatePickerDialog) {
                composerStartRestartGroup.startReplaceGroup(993873646);
                PbBulkBookingRideDetailsDialogType.DatePickerDialog datePickerDialog = (PbBulkBookingRideDetailsDialogType.DatePickerDialog) pbBulkBookingRideDetailsDialogType;
                long j = datePickerDialog.f6911a;
                boolean zChanged3 = composerStartRestartGroup.changed(function2);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new fq0(function2, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function0 = (Function0) objRememberedValue4;
                boolean zChanged4 = composerStartRestartGroup.changed(function2);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new sn0(function2, i9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function3 = (Function1) objRememberedValue5;
                boolean zChanged5 = composerStartRestartGroup.changed(function2);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new fq0(function2, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Composer composer2 = composerStartRestartGroup;
                ChaloDatePickerKt.a(j, function0, function3, (Function0) objRememberedValue6, datePickerDialog.b, composer2, 0);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                int i10 = 6;
                if (pbBulkBookingRideDetailsDialogType instanceof PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog) {
                    composerStartRestartGroup.startReplaceGroup(994691116);
                    PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog passDateChangeConfirmationDialog = (PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog) pbBulkBookingRideDetailsDialogType;
                    boolean zChanged6 = composerStartRestartGroup.changed(function2);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new sn0(function2, i10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Function1 function4 = (Function1) objRememberedValue7;
                    boolean zChanged7 = composerStartRestartGroup.changed(function2);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new fq0(function2, 2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    d(passDateChangeConfirmationDialog, function4, (Function0) objRememberedValue8, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.d(pbBulkBookingRideDetailsDialogType, PbBulkBookingRideDetailsDialogType.ProductDisabledDialog.f6914a)) {
                    composerStartRestartGroup.startReplaceGroup(995342457);
                    String strC = StringResourcesHelperKt.c(StringEnum.RECENT_PRODUCTS_DISABLED_DIALOG_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC2 = StringResourcesHelperKt.c(StringEnum.RECENT_PRODUCTS_DISABLED_DIALOG_COPY, new Object[0], composerStartRestartGroup, 6);
                    String strC3 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6);
                    boolean zChanged8 = composerStartRestartGroup.changed(function2);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new fq0(function2, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    Function0 function5 = (Function0) objRememberedValue9;
                    boolean zChanged9 = composerStartRestartGroup.changed(function2);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        c = 4;
                        objRememberedValue10 = new fq0(function2, 4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        c = 4;
                    }
                    Composer composer3 = composerStartRestartGroup;
                    function1 = function2;
                    r15 = 0;
                    ChaloConfirmationDialogKt.b(strC, strC2, strC3, function5, null, null, null, (Function0) objRememberedValue10, composer3, 0, 112);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    boolean z = false;
                    function1 = function2;
                    if (pbBulkBookingRideDetailsDialogType instanceof PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog) {
                        composerStartRestartGroup.startReplaceGroup(995980158);
                        PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog passDateChangeFailureDialog = (PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog) pbBulkBookingRideDetailsDialogType;
                        boolean zChanged10 = composerStartRestartGroup.changed(function1);
                        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (zChanged10 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new fq0(function1, 5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        e(passDateChangeFailureDialog, (Function0) objRememberedValue11, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        r15 = z;
                    } else {
                        if (pbBulkBookingRideDetailsDialogType != null) {
                            throw pk0.p(composerStartRestartGroup, -106488726);
                        }
                        composerStartRestartGroup.startReplaceGroup(996237365);
                        composerStartRestartGroup.endReplaceGroup();
                        r15 = z;
                    }
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r15);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r15);
                int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, r15).t, null, 2, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, r15);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r15);
                int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
                constructor2 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i12), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                i3 = WhenMappings.b[((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).l.ordinal()];
                if (i3 != 1) {
                    mutableState = mutableStateA;
                    companion = companion;
                    obj = null;
                    i4 = 1;
                    companion2 = companion2;
                    ?? r2 = r15;
                    i5 = 6;
                    composerStartRestartGroup.startReplaceGroup(896388666);
                    ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, r2);
                    composerStartRestartGroup.endReplaceGroup();
                    i6 = r2;
                } else if (i3 != 2) {
                    mutableState = mutableStateA;
                    companion = companion;
                    obj = null;
                    companion2 = companion2;
                    i6 = r15;
                    composerStartRestartGroup.startReplaceGroup(896515952);
                    i4 = 1;
                    i5 = 6;
                    m(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i3 == 3) {
                        throw pk0.p(composerStartRestartGroup, 721651648);
                    }
                    composerStartRestartGroup.startReplaceGroup(896776848);
                    i8 = WhenMappings.f6915a[((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).o.ordinal()];
                    if (i8 != 1) {
                        mutableState = mutableStateA;
                        companion = companion;
                        obj = null;
                        companion2 = companion2;
                        ?? r3 = r15;
                        composerStartRestartGroup.startReplaceGroup(896822108);
                        PbBulkBookingRideDetailsViewState pbBulkBookingRideDetailsViewState = (PbBulkBookingRideDetailsViewState) mutableState.getValue();
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new fq0(function1, 9);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function6 = (Function0) objRememberedValue;
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new fq0(function1, 10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        PBPreBookingSuccessProceedScreenKt.a(pbBulkBookingRideDetailsViewState, function6, (Function0) objRememberedValue2, composerStartRestartGroup, r3 == true ? 1 : 0);
                        composerStartRestartGroup.endReplaceGroup();
                        r0 = r3;
                    } else {
                        if (i8 == 2) {
                            throw pk0.p(composerStartRestartGroup, 721664946);
                        }
                        composerStartRestartGroup.startReplaceGroup(897560497);
                        superPassResponseAppModel = ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).f;
                        if (superPassResponseAppModel == null) {
                            composerStartRestartGroup.startReplaceGroup(897560496);
                            composerStartRestartGroup.endReplaceGroup();
                            mutableState = mutableStateA;
                            obj = null;
                            r1 = r15;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(897560497);
                            mutableState = mutableStateA;
                            Composer composer4 = composerStartRestartGroup;
                            Function1 function7 = function1;
                            r1 = 0;
                            obj = null;
                            i(((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).b, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).c, superPassResponseAppModel, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).q, function7, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).d, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).e, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).h, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).i, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).j, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).m, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).f6934a, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).v, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).x, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).w, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).z, composer4, 0, 0);
                            function1 = function7;
                            composerStartRestartGroup = composer4;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        r0 = r1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = 6;
                    i4 = 1;
                    i6 = r0;
                }
                composerStartRestartGroup.endNode();
                i7 = WhenMappings.c[((PbBulkBookingRideDetailsViewState) mutableState.getValue()).k.ordinal()];
                if (i7 != i4 || i7 == 2) {
                    composerStartRestartGroup.startReplaceGroup(1505915042);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i7 == 3) {
                    ComposeUiNode.Companion companion4 = companion2;
                    composerStartRestartGroup.startReplaceGroup(1506006523);
                    Arrangement.Vertical bottom = arrangement.getBottom();
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, i4, obj);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(bottom, companion3.getStart(), composerStartRestartGroup, i5);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i6);
                    int i13 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i13), composerM3915constructorimpl3));
                    String strC4 = StringResourcesHelperKt.c(StringEnum.FETCHING, new Object[i6], composerStartRestartGroup, i5);
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    ChaloSnackbarKt.a(null, strC4, null, (Function0) objRememberedValue12, composerStartRestartGroup, 3456, 1);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i7 != 4) {
                        throw pk0.p(composerStartRestartGroup, -505614798);
                    }
                    composerStartRestartGroup.startReplaceGroup(1506427627);
                    Arrangement.Vertical bottom2 = arrangement.getBottom();
                    Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(companion, 0.0f, i4, obj);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(bottom2, companion3.getStart(), composerStartRestartGroup, i5);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i6);
                    int i14 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default2);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    ComposeUiNode.Companion companion5 = companion2;
                    pk0.v(companion5, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i14), composerM3915constructorimpl4));
                    String strC5 = StringResourcesHelperKt.c(StringEnum.RIDE_DATA_MIGHT_NOT_BE_UP_TO_DATE_MSG, new Object[i6], composerStartRestartGroup, i5);
                    boolean zChanged11 = composerStartRestartGroup.changed(function1);
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (zChanged11 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new fq0(function1, 11);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    ChaloSnackbarKt.a(null, strC5, null, (Function0) objRememberedValue13, composerStartRestartGroup, 0, 5);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            r15 = 0;
            function1 = function2;
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), r15);
            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r15);
            int i15 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
            Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl5, Integer.valueOf(i15), composerM3915constructorimpl5));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, r15).t, null, 2, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composerStartRestartGroup, r15);
            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r15);
            int i16 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default2);
            constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
            Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl6, Integer.valueOf(i16), composerM3915constructorimpl6));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            i3 = WhenMappings.b[((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).l.ordinal()];
            if (i3 != 1) {
                mutableState = mutableStateA;
                companion = companion;
                obj = null;
                i4 = 1;
                companion2 = companion2;
                ?? r4 = r15;
                i5 = 6;
                composerStartRestartGroup.startReplaceGroup(896388666);
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, r4);
                composerStartRestartGroup.endReplaceGroup();
                i6 = r4;
            } else if (i3 != 2) {
                mutableState = mutableStateA;
                companion = companion;
                obj = null;
                companion2 = companion2;
                i6 = r15;
                composerStartRestartGroup.startReplaceGroup(896515952);
                i4 = 1;
                i5 = 6;
                m(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 == 3) {
                    throw pk0.p(composerStartRestartGroup, 721651648);
                }
                composerStartRestartGroup.startReplaceGroup(896776848);
                i8 = WhenMappings.f6915a[((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).o.ordinal()];
                if (i8 != 1) {
                    mutableState = mutableStateA;
                    companion = companion;
                    obj = null;
                    companion2 = companion2;
                    ?? r5 = r15;
                    composerStartRestartGroup.startReplaceGroup(896822108);
                    PbBulkBookingRideDetailsViewState pbBulkBookingRideDetailsViewState2 = (PbBulkBookingRideDetailsViewState) mutableState.getValue();
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new fq0(function1, 9);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new fq0(function1, 9);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function8 = (Function0) objRememberedValue;
                    zChanged2 = composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new fq0(function1, 10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new fq0(function1, 10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    PBPreBookingSuccessProceedScreenKt.a(pbBulkBookingRideDetailsViewState2, function8, (Function0) objRememberedValue2, composerStartRestartGroup, r5 == true ? 1 : 0);
                    composerStartRestartGroup.endReplaceGroup();
                    r0 = r5;
                } else {
                    if (i8 == 2) {
                        throw pk0.p(composerStartRestartGroup, 721664946);
                    }
                    composerStartRestartGroup.startReplaceGroup(897560497);
                    superPassResponseAppModel = ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).f;
                    if (superPassResponseAppModel == null) {
                        composerStartRestartGroup.startReplaceGroup(897560496);
                        composerStartRestartGroup.endReplaceGroup();
                        mutableState = mutableStateA;
                        obj = null;
                        r1 = r15;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(897560497);
                        mutableState = mutableStateA;
                        Composer composer5 = composerStartRestartGroup;
                        Function1 function9 = function1;
                        r1 = 0;
                        obj = null;
                        i(((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).b, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).c, superPassResponseAppModel, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).q, function9, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).d, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).e, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).h, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).i, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).j, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).m, ((PbBulkBookingRideDetailsViewState) mutableStateA.getValue()).f6934a, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).v, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).x, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).w, ((PbBulkBookingRideDetailsViewState) mutableState.getValue()).z, composer5, 0, 0);
                        function1 = function9;
                        composerStartRestartGroup = composer5;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    r0 = r1;
                }
                composerStartRestartGroup.endReplaceGroup();
                i5 = 6;
                i4 = 1;
                i6 = r0;
            }
            composerStartRestartGroup.endNode();
            i7 = WhenMappings.c[((PbBulkBookingRideDetailsViewState) mutableState.getValue()).k.ordinal()];
            if (i7 != i4) {
                composerStartRestartGroup.startReplaceGroup(1505915042);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1505915042);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(pbBulkBookingRideDetailsComponent, i, 19));
        }
    }

    public static final void i(final List list, final List list2, final SuperPassResponseAppModel superPassResponseAppModel, final PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType, Function1 function1, final List list3, final List list4, final String str, final String str2, final Integer num, final LinkedBookingLocalDataFetchStateLayoutType linkedBookingLocalDataFetchStateLayoutType, final String str3, final List list5, final boolean z, final String str4, final boolean z2, Composer composer, int i, int i2) {
        int i3;
        Function1 function2;
        int i4;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(912283824);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(superPassResponseAppModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(pbBulkBookingRideDetailsTabType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function2 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        } else {
            function2 = function1;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(linkedBookingLocalDataFetchStateLayoutType.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list5) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (74899 & i4) == 74898) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912283824, i3, i4, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsSuccessScreen (PbBulkBookingRideDetailsScreen.kt:278)");
            }
            boolean zChangedInstance = ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(list5) | ((i3 & 57344) == 16384) | composerStartRestartGroup.changedInstance(superPassResponseAppModel) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((i4 & 7168) == 2048) | ((i4 & 57344) == 16384) | ((458752 & i4) == 131072) | ((i4 & 14) == 4) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list3) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(list4) | composerStartRestartGroup.changedInstance(list2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function1 function3 = function2;
                Function1 function4 = new Function1() { // from class: sq0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.i(LazyColumn, "$this$LazyColumn");
                        final String str5 = str3;
                        final List list6 = list5;
                        final Function1 function5 = function3;
                        final SuperPassResponseAppModel superPassResponseAppModel2 = superPassResponseAppModel;
                        final String str6 = str;
                        final String str7 = str2;
                        final Integer num2 = num;
                        final boolean z3 = z;
                        final String str8 = str4;
                        final boolean z4 = z2;
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(547126203, true, new Function3() { // from class: tq0
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer4 = (Composer) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                Intrinsics.i(item, "$this$item");
                                if (composer4.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(547126203, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbBulkBookingRideDetailsScreen.kt:281)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ChaloToolBarKt.g(PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composer4, 0).h), str5, ChaloTheme.e(composer4, 0).getDisplaySmall().m6771getFontSizeXSAIIZE(), null, composer4, 0, 8);
                                    List list7 = list6;
                                    Function1 function6 = function5;
                                    if (list7 == null || list7.isEmpty()) {
                                        composer4.startReplaceGroup(1282229693);
                                    } else {
                                        composer4.startReplaceGroup(1295783141);
                                        Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer4, 0).h, 0.0f, 2, null), null, null, 3, null);
                                        boolean zChanged = composer4.changed(function6);
                                        Object objRememberedValue2 = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new sn0(function6, 8);
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        PbBulkBookingRideDetailsScreenKt.p(0, composer4, modifierAnimateContentSize$default, list7, (Function1) objRememberedValue2);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composer4, 0).h);
                                    boolean zChanged2 = composer4.changed(function6);
                                    Object objRememberedValue3 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new fq0(function6, 7);
                                        composer4.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue3;
                                    boolean zChanged3 = composer4.changed(function6);
                                    Object objRememberedValue4 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new fq0(function6, 8);
                                        composer4.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function0 function7 = (Function0) objRememberedValue4;
                                    boolean zChanged4 = composer4.changed(function6);
                                    Object objRememberedValue5 = composer4.rememberedValue();
                                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new sn0(function6, 9);
                                        composer4.updateRememberedValue(objRememberedValue5);
                                    }
                                    PbBulkBookingRideDetailsScreenKt.g(modifierM784padding3ABfNKs, superPassResponseAppModel2, str6, str7, num2, z3, str8, z4, function0, function7, (Function1) objRememberedValue5, composer4, 0, 0);
                                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composer4, 0).f, 1, null), ChaloTheme.b(composer4, 0).h), ChaloTheme.a(composer4, 0).r0, null, 2, null), composer4, 0);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }), 3, null);
                        int i5 = PbBulkBookingRideDetailsScreenKt.WhenMappings.e[linkedBookingLocalDataFetchStateLayoutType.ordinal()];
                        if (i5 == 1) {
                            LazyListScope.CC.o(LazyColumn, 2, null, null, ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a, 6, null);
                        } else if (i5 == 2) {
                            LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-316259398, true, new ab(function5, 7)), 3, null);
                        } else {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType2 = pbBulkBookingRideDetailsTabType;
                            LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1308681519, true, new rb(7, pbBulkBookingRideDetailsTabType2, function5)), 3, null);
                            int i6 = PbBulkBookingRideDetailsScreenKt.WhenMappings.d[pbBulkBookingRideDetailsTabType2.ordinal()];
                            if (i6 == 1) {
                                final List list7 = list;
                                if (list7.isEmpty()) {
                                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$PbBulkBookingRideDetailsScreenKt.b, 3, null);
                                } else {
                                    int size = list7.size();
                                    final int i7 = 0;
                                    final List list8 = list3;
                                    LazyListScope.CC.o(LazyColumn, size, null, null, ComposableLambdaKt.composableLambdaInstance(986655017, true, new Function4() { // from class: uq0
                                        /* JADX WARN: Code duplicated, block: B:101:0x0280  */
                                        /* JADX WARN: Code duplicated, block: B:102:0x0283  */
                                        /* JADX WARN: Code duplicated, block: B:104:0x0286  */
                                        /* JADX WARN: Code duplicated, block: B:106:0x0290  */
                                        /* JADX WARN: Code duplicated, block: B:109:0x02b6  */
                                        /* JADX WARN: Code duplicated, block: B:111:0x02be  */
                                        /* JADX WARN: Code duplicated, block: B:112:0x02cb  */
                                        /* JADX WARN: Code duplicated, block: B:113:0x02ff  */
                                        /* JADX WARN: Code duplicated, block: B:114:0x0332  */
                                        /* JADX WARN: Code duplicated, block: B:116:0x03a8  */
                                        /* JADX WARN: Code duplicated, block: B:118:0x03be  */
                                        /* JADX WARN: Code duplicated, block: B:123:0x03e9  */
                                        /* JADX WARN: Code duplicated, block: B:128:0x040d  */
                                        /* JADX WARN: Code duplicated, block: B:132:0x0431  */
                                        /* JADX WARN: Code duplicated, block: B:42:0x0104  */
                                        /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                                        /* JADX WARN: Code duplicated, block: B:45:0x010a  */
                                        /* JADX WARN: Code duplicated, block: B:47:0x0114  */
                                        /* JADX WARN: Code duplicated, block: B:52:0x0149  */
                                        /* JADX WARN: Code duplicated, block: B:57:0x016c  */
                                        /* JADX WARN: Code duplicated, block: B:60:0x0192  */
                                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v25 java.lang.Object, still in use, count: 2, list:
                                              (r3v25 java.lang.Object) from 0x027c: PHI (r3 I:??) = (r3v7 java.lang.Object), (r3v25 java.lang.Object) binds: [B:98:0x027b, B:138:0x027c] A[DONT_GENERATE, DONT_INLINE]
                                              (r3v25 java.lang.Object) from 0x0274: CHECK_CAST (app.chalo.premiumbus.bulkbookingridedetails.ui.BookingStartDateHeader) (r3v25 java.lang.Object)
                                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                                            */
                                        @Override // kotlin.jvm.functions.Function4
                                        public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
                                            /*
                                                Method dump skipped, instruction units count: 1120
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.uq0.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                        }
                                    }), 6, null);
                                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$PbBulkBookingRideDetailsScreenKt.c, 3, null);
                                }
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                final List list9 = list2;
                                if (list9.isEmpty()) {
                                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$PbBulkBookingRideDetailsScreenKt.d, 3, null);
                                } else {
                                    int size2 = list9.size();
                                    final int i8 = 1;
                                    final List list10 = list4;
                                    LazyListScope.CC.o(LazyColumn, size2, null, null, ComposableLambdaKt.composableLambdaInstance(-383852513, true, new Function4() { // from class: uq0
                                        /* JADX WARN: Code duplicated, block: B:101:0x0280  */
                                        /* JADX WARN: Code duplicated, block: B:102:0x0283  */
                                        /* JADX WARN: Code duplicated, block: B:104:0x0286  */
                                        /* JADX WARN: Code duplicated, block: B:106:0x0290  */
                                        /* JADX WARN: Code duplicated, block: B:109:0x02b6  */
                                        /* JADX WARN: Code duplicated, block: B:111:0x02be  */
                                        /* JADX WARN: Code duplicated, block: B:112:0x02cb  */
                                        /* JADX WARN: Code duplicated, block: B:113:0x02ff  */
                                        /* JADX WARN: Code duplicated, block: B:114:0x0332  */
                                        /* JADX WARN: Code duplicated, block: B:116:0x03a8  */
                                        /* JADX WARN: Code duplicated, block: B:118:0x03be  */
                                        /* JADX WARN: Code duplicated, block: B:123:0x03e9  */
                                        /* JADX WARN: Code duplicated, block: B:128:0x040d  */
                                        /* JADX WARN: Code duplicated, block: B:132:0x0431  */
                                        /* JADX WARN: Code duplicated, block: B:42:0x0104  */
                                        /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                                        /* JADX WARN: Code duplicated, block: B:45:0x010a  */
                                        /* JADX WARN: Code duplicated, block: B:47:0x0114  */
                                        /* JADX WARN: Code duplicated, block: B:52:0x0149  */
                                        /* JADX WARN: Code duplicated, block: B:57:0x016c  */
                                        /* JADX WARN: Code duplicated, block: B:60:0x0192  */
                                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v25 java.lang.Object, still in use, count: 2, list:
                                              (r3v25 java.lang.Object) from 0x027c: PHI (r3 I:??) = (r3v7 java.lang.Object), (r3v25 java.lang.Object) binds: [B:98:0x027b, B:138:0x027c] A[DONT_GENERATE, DONT_INLINE]
                                              (r3v25 java.lang.Object) from 0x0274: CHECK_CAST (app.chalo.premiumbus.bulkbookingridedetails.ui.BookingStartDateHeader) (r3v25 java.lang.Object)
                                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                                            */
                                        @Override // kotlin.jvm.functions.Function4
                                        public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
                                            /*
                                                Method dump skipped, instruction units count: 1120
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.uq0.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                        }
                                    }), 6, null);
                                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$PbBulkBookingRideDetailsScreenKt.e, 3, null);
                                }
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                composer3 = composerStartRestartGroup;
                composer3.updateRememberedValue(function4);
                objRememberedValue = function4;
            } else {
                composer3 = composerStartRestartGroup;
            }
            composer2 = composer3;
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, FrameMetricsAggregator.EVERY_DURATION);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ut(list, list2, superPassResponseAppModel, pbBulkBookingRideDetailsTabType, function1, list3, list4, str, str2, num, linkedBookingLocalDataFetchStateLayoutType, str3, list5, z, str4, z2, i, i2));
        }
    }

    public static final void j(Composer composer, int i, String str) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427079256);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427079256, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbRideBookingNoPlannedRidesComposable (PbBulkBookingRideDetailsScreen.kt:810)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_EMPTY_STATE, composerStartRestartGroup, 6), "", PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).l, 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            TextKt.m2623TextNvy7gAk(str, PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).d), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, i2 & 14, 0, 130044);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str, i, 14));
        }
    }

    public static final void k(Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-854255602);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-854255602, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbRideBookingPlannedRidesErrorComposable (PbBulkBookingRideDetailsScreen.kt:836)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_DAILY_LIMIT, composerStartRestartGroup, 6), "", PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).l, 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SOMETHING_WENT_WRONG, new Object[0], composerStartRestartGroup, 6), PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).d), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 130044);
            String strC = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function1 = function0;
                objRememberedValue = new p80(function1, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function1 = function0;
            }
            composer2 = composerStartRestartGroup;
            ChaloFilledButtonKt.g(modifierM785paddingVpY3zN4, strC, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composer2, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = function0;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 11, function1));
        }
    }

    public static final void l(PremiumBusBulkBookingUpcomingRidesCardData cardData, Composer composer, int i) {
        int i2;
        Intrinsics.i(cardData, "cardData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-434741514);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434741514, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbRidePickUpAndDropOffDetailCard (PbBulkBookingRideDetailsScreen.kt:981)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.4f), ChaloTheme.a(composerStartRestartGroup, 0).r0, ChaloTheme.d(composerStartRestartGroup, 0).g), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            ChaloBusActiveTicketKt.b(null, cardData.g, cardData.e, composerStartRestartGroup, 0, 1);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).b), ChaloTheme.a(composerStartRestartGroup, 0).s0, null, 2, null), composerStartRestartGroup, 0);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PICK_UP_FROM, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 131066);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            FromAndToStopCardKt.e(IconType.IC_STOP_DIRECTIONS, StringResourcesHelperKt.c(StringEnum.DIRECTIONS, new Object[0], composerStartRestartGroup, 6), null, SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), 1, null, composerStartRestartGroup, 1769478, 132);
            composerStartRestartGroup.endNode();
            String str = cardData.j;
            if (str == null) {
                str = "-";
            }
            TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium(), composerStartRestartGroup, 0, 0, 131070);
            composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(cardData, i, 18));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-596314919);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596314919, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PreBookingRideDetailFetchFailure (PbBulkBookingRideDetailsScreen.kt:1041)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new f0(density, mutableState, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default2, (Function1) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ChaloGradientBackgroundKt.a(boxScopeInstance, BgHighlightType.QUADRANT, ((Dp) mutableState.getValue()).m7292unboximpl(), null, composerStartRestartGroup, 54, 4);
            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_DAILY_LIMIT, composerStartRestartGroup, 6), "", SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 0).v), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SOMETHING_WENT_WRONG, new Object[0], composerStartRestartGroup, 6), SizeKt.fillMaxWidth(PaddingKt.m784padding3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.7f), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodySmall(), composerStartRestartGroup, 0, 0, 130044);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 15));
        }
    }

    public static final void n(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1170083353);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1170083353, i, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PreBookingRideDetailsLoadingCard (PbBulkBookingRideDetailsScreen.kt:1082)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t;
            int i2 = CardDefaults.$stable;
            CardKt.Card(modifierM784padding3ABfNKs, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f), cardDefaults.m1694cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i2 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i2 << 18, 62), null, ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 11));
        }
    }

    public static final void o(PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData, Modifier modifier, String str, String str2, IconType iconType, Composer composer, int i) {
        int i2;
        Object obj;
        Object obj2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-66470161);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusBulkBookingUpcomingRidesCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = str;
            i2 |= composerStartRestartGroup.changed(obj) ? 256 : 128;
        } else {
            obj = str;
        }
        if ((i & 3072) == 0) {
            obj2 = str2;
            i2 |= composerStartRestartGroup.changed(obj2) ? 2048 : 1024;
        } else {
            obj2 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType.ordinal()) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-66470161, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBookingUnderProgressOrFailedCard (PbBulkBookingRideDetailsScreen.kt:936)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).e);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t;
            int i3 = CardDefaults.$stable;
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i3 << 12, 14);
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i3 << 18, 62);
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(modifierFillMaxWidth$default, roundedCornerShapeM1074RoundedCornerShape0680j_4, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(556881213, true, new c0(premiumBusBulkBookingUpcomingRidesCardData, iconType, obj, obj2, 12), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) premiumBusBulkBookingUpcomingRidesCardData, modifier, (Object) str, (Object) str2, (Object) iconType, i, 22));
        }
    }

    public static final void p(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-931735798);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-931735798, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusRollOverAndDateChangeBanner (PbBulkBookingRideDetailsScreen.kt:1441)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new af(list, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 6, 2);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = Integer.valueOf(list.size());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue = ((Number) objRememberedValue2).intValue();
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, null, null, 0, ChaloTheme.b(composerStartRestartGroup, 0).h, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2052524621, true, new bf(3, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 24576, 16350);
            composerStartRestartGroup = composerStartRestartGroup;
            if (iIntValue > 1) {
                composerStartRestartGroup.startReplaceGroup(-1620712739);
                ChaloSpacersKt.u(composerStartRestartGroup, 0);
                ChaloDotsIndicatorsKt.a(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, ChaloTheme.a(composerStartRestartGroup, 0).n, iIntValue, pagerStateRememberPagerState.getCurrentPage(), composerStartRestartGroup, 24576);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1677566770);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qh(modifier, list, function1, i, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(List list, PbBulkBookingRideDetailsTabType currentlySelectedTabType, Function1 onTabClick, Composer composer, int i) {
        List list2;
        float fM7278constructorimpl;
        Intrinsics.i(currentlySelectedTabType, "currentlySelectedTabType");
        Intrinsics.i(onTabClick, "onTabClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(734751995);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(currentlySelectedTabType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTabClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            List listS = CollectionsKt.S(PbBulkBookingRideDetailsTabType.UPCOMING, PbBulkBookingRideDetailsTabType.PAST);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(734751995, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.UpcomingAndPastRidesFilterTab (PbBulkBookingRideDetailsScreen.kt:1131)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1722044770);
                fM7278constructorimpl = ChaloTheme.c(composerStartRestartGroup, 0).d;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1722045245);
                composerStartRestartGroup.endReplaceGroup();
                fM7278constructorimpl = Dp.m7278constructorimpl(0);
            }
            int iIndexOf = listS.indexOf(currentlySelectedTabType);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t;
            int i3 = CardDefaults.$stable;
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i3 << 12, 14);
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(fM7278constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i3 << 18, 62);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), 0.0f, 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new xq0(mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CardKt.Card(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue2), null, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(209530605, true, new bg(iIndexOf, listS, currentlySelectedTabType, onTabClick, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            list2 = listS;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            list2 = list;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 9, list2, currentlySelectedTabType, onTabClick));
        }
    }
}
