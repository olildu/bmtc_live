package app.chalo.ridehailing.feedback;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.a31;
import defpackage.b31;
import defpackage.c31;
import defpackage.d31;
import defpackage.dq;
import defpackage.gf;
import defpackage.hi;
import defpackage.ml0;
import defpackage.ob;
import defpackage.pk0;
import defpackage.rx0;
import defpackage.sx0;
import defpackage.t8;
import defpackage.xm0;
import defpackage.yu0;
import defpackage.zt0;
import io.github.alexzhirkevich.compottie.LottieAnimationState;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/unit/Dp;", "feedbackHeaderHtInDp", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RideUserFeedbackScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9172a;

        static {
            int[] iArr = new int[RideFeedbackStep.values().length];
            try {
                iArr[RideFeedbackStep.THANK_YOU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideFeedbackStep.FEEDBACK_FORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9172a = iArr;
        }
    }

    public static final void a(ImageUrlUIState imageUrlUIState, ImageUIState imageUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(81434955);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUrlUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81434955, i2, -1, "app.chalo.ridehailing.feedback.DriverComponentUI (RideUserFeedbackScreen.kt:469)");
            }
            if (imageUrlUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-627639325);
                SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1591568413, true, new b31(imageUIState, 1), composerStartRestartGroup, 54), null, null, null, null, composerStartRestartGroup, 1572912, 0, 65468);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-627428215);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, (i2 >> 3) & 14, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c31(imageUrlUIState, imageUIState, i, 1));
        }
    }

    public static final void b(RideFeedbackHeaderCtaUISState rideFeedbackHeaderCtaUISState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(585080704);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideFeedbackHeaderCtaUISState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585080704, i2, -1, "app.chalo.ridehailing.feedback.FeedbackHeaderCtaComponent (RideUserFeedbackScreen.kt:217)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            UiEventHandler uiEventHandler = rideFeedbackHeaderCtaUISState.d;
            RideFeedbackHeaderCtaUISpecs rideFeedbackHeaderCtaUISpecs = rideFeedbackHeaderCtaUISState.f9143a;
            Modifier modifierB = ComposeUtilsKt.b(companion, uiEventHandler, composerStartRestartGroup, 3078, 2);
            BorderUISpec borderUISpec = rideFeedbackHeaderCtaUISpecs.c;
            ChaloPadding chaloPadding = rideFeedbackHeaderCtaUISpecs.f9144a;
            ChaloColorToken chaloColorToken = rideFeedbackHeaderCtaUISpecs.b;
            BorderUISpec borderUISpec2 = rideFeedbackHeaderCtaUISpecs.c;
            TextWithLeftAndTrailingRightIconComponentKt.a(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(BorderUISpecKt.a(modifierB, borderUISpec), ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(borderUISpec2.c)), chaloPadding), rideFeedbackHeaderCtaUISState.b, composerStartRestartGroup, 0, 0);
            ChaloSpacersKt.a(rideFeedbackHeaderCtaUISpecs.d, composerStartRestartGroup, 0);
            TextWithLeftAndTrailingRightIconComponentKt.a(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(BorderUISpecKt.a(ComposeUtilsKt.b(companion, rideFeedbackHeaderCtaUISState.e, composerStartRestartGroup, 3078, 2), borderUISpec2), ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(borderUISpec2.c)), chaloPadding), rideFeedbackHeaderCtaUISState.c, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(rideFeedbackHeaderCtaUISState, i, i3));
        }
    }

    public static final void c(Function2 vehicleImage, Function2 function2, float f, Composer composer, int i) {
        int i2;
        float f2;
        Intrinsics.i(vehicleImage, "vehicleImage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1736157900);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(vehicleImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1736157900, i3, -1, "app.chalo.ridehailing.feedback.OverlappingVehicleAndDriverComponent (RideUserFeedbackScreen.kt:410)");
            }
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ml0(vehicleImage, function2, 0.4f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = 0.4f;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f2 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(vehicleImage, function2, f2, i, 6));
        }
    }

    public static final void d(Modifier modifier, RideFeedbackContentUIState rideFeedbackContentUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1704936287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rideFeedbackContentUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1704936287, i2, -1, "app.chalo.ridehailing.feedback.RideFeedbackContent (RideUserFeedbackScreen.kt:255)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            long jC = ChaloColorTokenKt.c(ChaloColorToken.White.f9870a);
            RideFeedbackContentUISpecs rideFeedbackContentUISpecs = rideFeedbackContentUIState.f9138a;
            RideFeedbackReasonCardUIState rideFeedbackReasonCardUIState = rideFeedbackContentUIState.c;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifierFillMaxSize$default, jC, ChaloThemeKt.d(rideFeedbackContentUISpecs.f9137a)), rideFeedbackContentUISpecs.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            j(rideFeedbackContentUIState.b, composerStartRestartGroup, 0);
            if (rideFeedbackReasonCardUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-989959413);
                ChaloSpacersKt.a(rideFeedbackContentUISpecs.c, composerStartRestartGroup, 0);
                g(rideFeedbackReasonCardUIState, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-999716105);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 28, modifier, rideFeedbackContentUIState));
        }
    }

    public static final void e(RideFeedbackCtaUIState rideFeedbackCtaUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-480017136);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rideFeedbackCtaUIState) : composerStartRestartGroup.changedInstance(rideFeedbackCtaUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-480017136, i2, -1, "app.chalo.ridehailing.feedback.RideFeedbackCta (RideUserFeedbackScreen.kt:383)");
            }
            ChaloRoundedCardKt.a(rideFeedbackCtaUIState.f9140a.b, null, ComposableLambdaKt.rememberComposableLambda(-100804353, true, new sx0(rideFeedbackCtaUIState, 9), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(rideFeedbackCtaUIState, i, 5));
        }
    }

    public static final void f(Modifier modifier, RideFeedbackHeaderUIState rideFeedbackHeaderUIState, Composer composer, int i) {
        int i2;
        ComposableLambda composableLambdaRememberComposableLambda;
        Composer composerStartRestartGroup = composer.startRestartGroup(628475951);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rideFeedbackHeaderUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628475951, i2, -1, "app.chalo.ridehailing.feedback.RideFeedbackHeader (RideUserFeedbackScreen.kt:177)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            RideFeedbackHeaderUISpecs rideFeedbackHeaderUISpecs = rideFeedbackHeaderUIState.f9146a;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, rideFeedbackHeaderUISpecs.f);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(rideFeedbackHeaderUISpecs.f9145a), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-183326661, true, new xm0(rideFeedbackHeaderUIState, 8), composerStartRestartGroup, 54);
            ImageUIState imageUIState = rideFeedbackHeaderUIState.e;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1149951655);
                composerStartRestartGroup.endReplaceGroup();
                composableLambdaRememberComposableLambda = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1149951656);
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1192055530, true, new zt0(i3, rideFeedbackHeaderUIState, imageUIState), composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
            }
            c(composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda, 0.0f, composerStartRestartGroup, 6);
            ChaloSpacersKt.a(rideFeedbackHeaderUISpecs.c, composerStartRestartGroup, 0);
            TextWithLeftAndTrailingRightIconComponentKt.a(null, rideFeedbackHeaderUIState.f, composerStartRestartGroup, 0, 1);
            if (rideFeedbackHeaderUIState.g == null) {
                composerStartRestartGroup.startReplaceGroup(1150415942);
            } else {
                composerStartRestartGroup.startReplaceGroup(1150415943);
                ChaloSpacersKt.a(rideFeedbackHeaderUISpecs.d, composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, rideFeedbackHeaderUIState.g, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(rideFeedbackHeaderUISpecs.e, composerStartRestartGroup, 0);
            b(rideFeedbackHeaderUIState.h, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 27, modifier, rideFeedbackHeaderUIState));
        }
    }

    public static final void g(RideFeedbackReasonCardUIState rideFeedbackReasonCardUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782227942);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideFeedbackReasonCardUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782227942, i2, -1, "app.chalo.ridehailing.feedback.RideFeedbackReasonCard (RideUserFeedbackScreen.kt:319)");
            }
            RideFeedbackReasonCardUISpecs rideFeedbackReasonCardUISpecs = rideFeedbackReasonCardUIState.f9148a;
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(rideFeedbackReasonCardUISpecs.f9147a);
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontalA, composerStartRestartGroup, 0);
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
            ChaloTextViewKt.a(null, rideFeedbackReasonCardUIState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.a(rideFeedbackReasonCardUISpecs.d, composerStartRestartGroup, 0);
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), arrangement.m673spacedByD5KLDUw(rideFeedbackReasonCardUISpecs.b, Alignment.INSTANCE.getStart()), arrangement.m672spacedBy0680j_4(rideFeedbackReasonCardUISpecs.c), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-391299915, true, new sx0(rideFeedbackReasonCardUIState, 7), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            RideFeedbackSubtagCardUIState rideFeedbackSubtagCardUIState = rideFeedbackReasonCardUIState.d;
            if (rideFeedbackSubtagCardUIState == null) {
                composerStartRestartGroup.startReplaceGroup(2109876886);
            } else {
                composerStartRestartGroup.startReplaceGroup(2109876887);
                ChaloSpacersKt.a(rideFeedbackSubtagCardUIState.f9150a.d, composerStartRestartGroup, 0);
                h(rideFeedbackSubtagCardUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            BaseTextFieldUIState.TextFieldUIState textFieldUIState = rideFeedbackReasonCardUIState.f;
            if (textFieldUIState == null) {
                composerStartRestartGroup.startReplaceGroup(2110080928);
            } else {
                composerStartRestartGroup.startReplaceGroup(2110080929);
                ChaloSpacersKt.a(rideFeedbackReasonCardUISpecs.e, composerStartRestartGroup, 0);
                TextUIState.ChaloTextUIState chaloTextUIState = rideFeedbackReasonCardUIState.e;
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-555290333);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-555290332);
                    ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                    ChaloSpacersKt.a(rideFeedbackReasonCardUISpecs.d, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                BaseChaloTextFieldKt.a(textFieldUIState, ChaloThemeKt.c(BorderUISpecKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), rideFeedbackReasonCardUISpecs.h), rideFeedbackReasonCardUISpecs.g), null, null, null, null, composerStartRestartGroup, 0, 124);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(rideFeedbackReasonCardUIState, i, i3));
        }
    }

    public static final void h(RideFeedbackSubtagCardUIState rideFeedbackSubtagCardUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1847247526);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideFeedbackSubtagCardUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1847247526, i2, -1, "app.chalo.ridehailing.feedback.RideFeedbackSubtagCard (RideUserFeedbackScreen.kt:362)");
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
            TextUIState.ChaloTextUIState chaloTextUIState = rideFeedbackSubtagCardUIState.b;
            RideFeedbackSubtagCardUISpecs rideFeedbackSubtagCardUISpecs = rideFeedbackSubtagCardUIState.f9150a;
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.a(rideFeedbackSubtagCardUISpecs.c, composerStartRestartGroup, 0);
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), arrangement.m673spacedByD5KLDUw(rideFeedbackSubtagCardUISpecs.f9149a, companion2.getStart()), arrangement.m672spacedBy0680j_4(rideFeedbackSubtagCardUISpecs.b), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1456319499, true, new sx0(rideFeedbackSubtagCardUIState, 8), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 56);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(rideFeedbackSubtagCardUIState, i, 3));
        }
    }

    public static final void i(RideFeedbackThankYouUIState rideFeedbackThankYouUIState, Composer composer, int i) {
        int i2;
        Modifier modifierB;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1284632722);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideFeedbackThankYouUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1284632722, i2, -1, "app.chalo.ridehailing.feedback.RideFeedbackThankYouScreen (RideUserFeedbackScreen.kt:145)");
            }
            GifImageUIState gifImageUIState = rideFeedbackThankYouUIState.b;
            LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(gifImageUIState.f10033a, composerStartRestartGroup, 0);
            LottieAnimationState lottieAnimationStateA = LottieResourceHelperKt.a(lottieCompositionResultImplB, gifImageUIState.b, composerStartRestartGroup, 0);
            Boolean boolValueOf = Boolean.valueOf(lottieAnimationStateA.h());
            Float fValueOf = Float.valueOf(lottieAnimationStateA.getProgress());
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateA) | composerStartRestartGroup.changedInstance(rideFeedbackThankYouUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RideUserFeedbackScreenKt$RideFeedbackThankYouScreen$1$1(lottieAnimationStateA, rideFeedbackThankYouUIState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, fValueOf, (Function2) objRememberedValue, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterC = LottieResourceHelperKt.c(lottieCompositionResultImplB, gifImageUIState.b, false, composerStartRestartGroup, 0, 28);
            ImageUISize imageUISize = gifImageUIState.c;
            ImageKt.Image(painterC, (String) null, (imageUISize == null || (modifierB = ImageUIStateKt.b(companion, imageUISize)) == null) ? companion : modifierB, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.a(rideFeedbackThankYouUIState.f9152a.f9151a, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, rideFeedbackThankYouUIState.c, null, null, composerStartRestartGroup, 0, 13);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(rideFeedbackThankYouUIState, i, i3));
        }
    }

    public static final void j(RideFeedbackUserRatingCardUIState rideFeedbackUserRatingCardUIState, Composer composer, int i) {
        int i2;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1275261414);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideFeedbackUserRatingCardUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1275261414, i2, -1, "app.chalo.ridehailing.feedback.RideFeedbackUserRatingCard (RideUserFeedbackScreen.kt:276)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            RideFeedbackUserRatingCardUISpecs rideFeedbackUserRatingCardUISpecs = rideFeedbackUserRatingCardUIState.f9158a;
            TextUIState.ChaloTextUIState chaloTextUIState = rideFeedbackUserRatingCardUIState.b;
            Modifier modifierC = ChaloThemeKt.c(companion, rideFeedbackUserRatingCardUISpecs.f9157a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-401040884);
            } else {
                composerStartRestartGroup.startReplaceGroup(-401040883);
                ChaloTabTitleKt.b(null, chaloTextUIState, composerStartRestartGroup, 0, 1);
                ChaloSpacersKt.a(rideFeedbackUserRatingCardUIState.f9158a.b, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1680473239);
            ArrayList arrayList = rideFeedbackUserRatingCardUIState.c;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                int i7 = i6 + 1;
                ImageWithBorderUIState imageWithBorderUIState = (ImageWithBorderUIState) arrayList.get(i6);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = imageWithBorderUIState.c;
                DrawType drawType = imageWithBorderUIState.b;
                ImageWithBorderUISpecs imageWithBorderUISpecs = imageWithBorderUIState.f9135a;
                BorderUISpec borderUISpec = imageWithBorderUISpecs.f9134a;
                Modifier modifierC2 = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(BorderUISpecKt.a(ComposeUtilsKt.b(companion4, uiEventHandler$Companion$fromLambda$1, composerStartRestartGroup, 3078, i3), borderUISpec), ChaloColorTokenKt.c(imageWithBorderUISpecs.c), ChaloThemeKt.d(borderUISpec.c)), imageWithBorderUISpecs.b);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (drawType instanceof DrawType.Gif) {
                    composerStartRestartGroup.startReplaceGroup(913637361);
                    z = true;
                    GifUIKt.a(null, ((DrawType.Gif) drawType).f9908a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    z = true;
                    if (!(drawType instanceof DrawType.Icon)) {
                        throw pk0.p(composerStartRestartGroup, 168017733);
                    }
                    composerStartRestartGroup.startReplaceGroup(913765298);
                    CommonImageKt.a(((DrawType.Icon) drawType).f9909a, null, false, composerStartRestartGroup, 0, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                i6 = i7;
                i3 = 2;
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(rideFeedbackUserRatingCardUIState, i, 2));
        }
    }

    public static final void k(RideFeedbackViewState rideFeedbackViewState, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Density density;
        Composer composerStartRestartGroup = composer.startRestartGroup(-236029808);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(rideFeedbackViewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-236029808, i2, -1, "app.chalo.ridehailing.feedback.RideUserFeedbackFormScreen (RideUserFeedbackScreen.kt:80)");
            }
            boolean zChanged = composerStartRestartGroup.changed(rideFeedbackViewState.e != null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LoadingDialogUIState loadingDialogUIState = rideFeedbackViewState.b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-702091929);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -702091928, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            RideFeedbackToolbarUIState rideFeedbackToolbarUIState = rideFeedbackViewState.d;
            if (rideFeedbackToolbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1631121870);
                composerStartRestartGroup.endReplaceGroup();
                density = density2;
                companion = companion2;
            } else {
                composerStartRestartGroup.startReplaceGroup(1631121871);
                companion = companion2;
                density = density2;
                ChaloToolBarKt.a(null, ComposableLambdaKt.rememberComposableLambda(-506337492, true, new xm0(rideFeedbackToolbarUIState, 7), composerStartRestartGroup, 54), null, null, 0.0f, 0L, null, null, false, null, composerStartRestartGroup, 48, 0, 2045);
                composerStartRestartGroup.endReplaceGroup();
            }
            BoxWithConstraintsKt.BoxWithConstraints(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(833552220, true, new ob(23, rideFeedbackViewState, mutableState, density), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            e(rideFeedbackViewState.g, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d31(rideFeedbackViewState, i, 1));
        }
    }

    public static final void l(RideFeedbackViewState rideFeedbackViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1825064716);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideFeedbackViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825064716, i2, -1, "app.chalo.ridehailing.feedback.RideUserFeedbackScreen (RideUserFeedbackScreen.kt:70)");
            }
            int i3 = WhenMappings.f9172a[rideFeedbackViewState.c.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-511804312);
                RideFeedbackThankYouUIState rideFeedbackThankYouUIState = rideFeedbackViewState.h;
                if (rideFeedbackThankYouUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-511804313);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-511804312);
                    i(rideFeedbackThankYouUIState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    throw pk0.p(composerStartRestartGroup, -1540532899);
                }
                composerStartRestartGroup.startReplaceGroup(-1540527883);
                k(rideFeedbackViewState, composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d31(rideFeedbackViewState, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(RideUserFeedbackComponent rideUserFeedbackComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-497582603);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideUserFeedbackComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497582603, i2, -1, "app.chalo.ridehailing.feedback.RideUserFeedbackScreenMain (RideUserFeedbackScreen.kt:61)");
            }
            l((RideFeedbackViewState) SubscribeAsStateKt.a(rideUserFeedbackComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(rideUserFeedbackComponent, i, 29));
        }
    }

    public static final void n(ImageUrlUIState imageUrlUIState, ImageUIState imageUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1547401187);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUrlUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547401187, i2, -1, "app.chalo.ridehailing.feedback.VehicleComponentUI (RideUserFeedbackScreen.kt:451)");
            }
            if (imageUrlUIState != null) {
                composerStartRestartGroup.startReplaceGroup(744916489);
                SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1223904331, true, new b31(imageUIState, 0), composerStartRestartGroup, 54), null, null, null, null, composerStartRestartGroup, 1572912, 0, 65468);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(745129552);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, (i2 >> 3) & 14, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c31(imageUrlUIState, imageUIState, i, 0));
        }
    }
}
