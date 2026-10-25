package app.chalo.validationsdk.blevalidation.ui;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.bottomsheet.UserRatingBottomSheetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.components.qr.ChaloQrCodeKt;
import app.chalo.compose.resources.IconAssetHelper_androidKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.utils.CoilGifUtils;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import app.chalo.utils.SheetDefaultsHelperKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import coil3.ImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.SingletonAsyncImageKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.ab;
import defpackage.b0;
import defpackage.b3;
import defpackage.bb;
import defpackage.c6;
import defpackage.cb;
import defpackage.d0;
import defpackage.db;
import defpackage.dq;
import defpackage.e0;
import defpackage.fb;
import defpackage.g;
import defpackage.g0;
import defpackage.gb;
import defpackage.h0;
import defpackage.hb;
import defpackage.i4;
import defpackage.i41;
import defpackage.jb;
import defpackage.kb;
import defpackage.lb;
import defpackage.mb;
import defpackage.nb;
import defpackage.ob;
import defpackage.pb;
import defpackage.pk0;
import defpackage.qb;
import defpackage.r1;
import defpackage.rb;
import defpackage.s3;
import defpackage.s4;
import defpackage.t1;
import defpackage.u6;
import defpackage.ya;
import defpackage.z4;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0007²\u0006\u0010\u0010\u0002\u001a\u00060\u0000j\u0002`\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationState;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationViewState;", "viewState", "", "expanded", "", "alpha", "validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BleValidationScreen_androidKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10609a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[BleValidationBottomsheetType.values().length];
            try {
                iArr[BleValidationBottomsheetType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleValidationBottomsheetType.RIDE_FEEDBACK_BOTTOMSHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleValidationBottomsheetType.PRODUCT_AND_USER_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BleValidationBottomsheetType.NEARBY_DEVICES_PERMISSION_RATIONALE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BleValidationBottomsheetType.TAP_TO_VALIDATE_TUTORIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BleValidationBottomsheetType.POST_VALIDATION_BOTTOMSHEET_FOR_CONDUCTOR_VALIDATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BleValidationBottomsheetType.POST_VALIDATION_BOTTOMSHEET_FOR_TAP_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10609a = iArr;
            int[] iArr2 = new int[BleValidationLayoutType.values().length];
            try {
                iArr2[BleValidationLayoutType.BLE_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BleValidationLayoutType.BLE_TURN_ON_FULL_SCREEN_EXPLAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BleValidationLayoutType.NEARBY_DEVICES_FULL_SCREEN_EXPLAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BleValidationLayoutType.SWITCH_TO_QR_VALIDATION_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BleValidationLayoutType.QR_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
        }
    }

    public static final void A(BleValidationLayoutInfo bleValidationLayoutInfo, Function1 function1, String str, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1795676123);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1795676123, i2, -1, "app.chalo.validationsdk.blevalidation.ui.ProductAndTicketSection (BleValidationScreen.android.kt:578)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ya(function1, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.d(composerStartRestartGroup, 0).c, ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1402289764, true, new d0(3, bleValidationLayoutInfo, str), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 5, bleValidationLayoutInfo, function1, str));
        }
    }

    public static final void B(ProductAndUserDetailsBottomsheetInfo productAndUserDetailsBottomsheetInfo, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1286260436);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(productAndUserDetailsBottomsheetInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1286260436, i2, -1, "app.chalo.validationsdk.blevalidation.ui.ProductAndUserDetails (BleValidationScreen.android.kt:1235)");
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.d(composerStartRestartGroup, 0).b, ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, ComposableLambdaKt.rememberComposableLambda(1284949933, true, new c6(productAndUserDetailsBottomsheetInfo, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mb(productAndUserDetailsBottomsheetInfo, i, 0));
        }
    }

    public static final void C(ProductAndUserDetailsBottomsheetInfo productAndUserDetailsBottomsheetInfo, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(141182419);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(productAndUserDetailsBottomsheetInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141182419, i2, -1, "app.chalo.validationsdk.blevalidation.ui.ProductAndUserDetailsBottomsheetContent (BleValidationScreen.android.kt:1203)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m784padding3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 0).i), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            String str = productAndUserDetailsBottomsheetInfo.f10615a.f;
            if (str == null) {
                str = "";
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(str, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 0, 131064);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            B(productAndUserDetailsBottomsheetInfo, composerStartRestartGroup, i4 & 14);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.DISMISS_CAPS, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z = (i4 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ya(function1, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default2, strC, null, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 196614, 476);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 4, productAndUserDetailsBottomsheetInfo, function1, modifier));
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void D(app.chalo.validationsdk.blevalidation.ui.ProductAndUserDetailsBottomsheetInfo r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt.D(app.chalo.validationsdk.blevalidation.ui.ProductAndUserDetailsBottomsheetInfo, androidx.compose.runtime.Composer, int):void");
    }

    public static final void E(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Composer composer2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2045363532);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2045363532, i2, -1, "app.chalo.validationsdk.blevalidation.ui.ProductValidationDetailsUI (BleValidationScreen.android.kt:626)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 0).f);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            i3 = 0;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i2 >> 3) & 14, 0, 131066);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIEW_DETAILS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 0;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(modifier, str, i, i3));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    public static final void F(BleValidationLayoutInfo bleValidationLayoutInfo, Composer composer, int i) {
        int i2;
        BleValidationLayoutInfo bleValidationLayoutInfo2;
        ComposeUiNode.Companion companion;
        int i3;
        ?? r1;
        Modifier.Companion companion2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2144468795);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2144468795, i2, -1, "app.chalo.validationsdk.blevalidation.ui.QrValidationScreenContent (BleValidationScreen.android.kt:1149)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m784padding3ABfNKs(ScrollKt.verticalScroll$default(companion3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (bleValidationLayoutInfo.c.f10619a) {
                composerStartRestartGroup.startReplaceGroup(154714283);
                companion = companion5;
                ImageKt.Image(PainterResourceHelperKt.a(IconType.TAP_INDICATOR, composerStartRestartGroup, 6), "", columnScopeInstance.align(companion3, companion4.getCenterHorizontally()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                r1 = 0;
                i3 = 1;
                companion2 = companion3;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLE_QR_COPY, new Object[0], composerStartRestartGroup, 6), columnScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion4.getCenterHorizontally()), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130040);
                composerStartRestartGroup = composerStartRestartGroup;
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                companion = companion5;
                i3 = 1;
                r1 = 0;
                companion2 = companion3;
                composerStartRestartGroup.startReplaceGroup(155404095);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, i3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), r1);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r1);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            ComposeUiNode.Companion companion6 = companion;
            pk0.v(companion6, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            bleValidationLayoutInfo2 = bleValidationLayoutInfo;
            ChaloQrCodeKt.a(bleValidationLayoutInfo2.c.b, BoxScopeInstance.INSTANCE.align(SizeKt.m828size3ABfNKs(PaddingKt.m785paddingVpY3zN4(companion2, ChaloTheme.b(composerStartRestartGroup, r1).f, ChaloTheme.b(composerStartRestartGroup, r1).r), Dp.m7278constructorimpl(300)), companion4.getCenter()), 0.0f, null, composerStartRestartGroup, 0, 12);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            bleValidationLayoutInfo2 = bleValidationLayoutInfo;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bb(bleValidationLayoutInfo2, i, 0));
        }
    }

    public static final void G(BleValidationLayoutInfo bleValidationLayoutInfo, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1019441797);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019441797, i2, -1, "app.chalo.validationsdk.blevalidation.ui.SwitchToQrValidationContent (BleValidationScreen.android.kt:1010)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierA = dq.a(ColumnScopeInstance.INSTANCE, ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            H(bleValidationLayoutInfo, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.endNode();
            J(bleValidationLayoutInfo, function1, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new db(bleValidationLayoutInfo, function1, i, 1));
        }
    }

    public static final void H(BleValidationLayoutInfo bleValidationLayoutInfo, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        BleValidationLayoutInfo bleValidationLayoutInfo2 = bleValidationLayoutInfo;
        Composer composerStartRestartGroup = composer.startRestartGroup(1508972620);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508972620, i2, -1, "app.chalo.validationsdk.blevalidation.ui.SwitchToQrValidationContentUI (BleValidationScreen.android.kt:1034)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Painter painterA = PainterResourceHelperKt.a(IconType.TAP_INDICATOR, composerStartRestartGroup, 6);
            ContentScale fit = ContentScale.INSTANCE.getFit();
            Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getCenterHorizontally());
            int i5 = Painter.$stable;
            ImageKt.Image(painterA, "", modifierAlign, (Alignment) null, fit, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5 | 24624, 104);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-922283971);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResourcesHelperKt.c(StringEnum.FOR_BEST_EXPERIENCE, new Object[0], composerStartRestartGroup, 6));
            builder.append(" ");
            ComposeUtilsKt.a(builder);
            builder.append(" ");
            builder.append(StringResourcesHelperKt.c(StringEnum.SYMBOL_ON_THE_TICKETING, new Object[0], composerStartRestartGroup, 6));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m2624TextZ58ophY(annotatedString, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, ComposeUtilsKt.e(companion, CollectionsKt.R(IconType.BLE_TAP_SYMBOL)), null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 195576);
            ChaloSpacersKt.k(composerStartRestartGroup, 0);
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = CoilGifUtils.a(context).a();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ImageLoader imageLoader = (ImageLoader) objRememberedValue;
            bleValidationLayoutInfo2 = bleValidationLayoutInfo;
            String str = bleValidationLayoutInfo2.b.f10622a;
            i3 = 1;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            IconType iconType = IconType.BLE_TUT_PLACEHOLDER;
            AsyncImageKt.b(str, null, imageLoader, modifierFillMaxSize$default, IconAssetHelper_androidKt.a(iconType, composerStartRestartGroup, 6), IconAssetHelper_androidKt.a(iconType, composerStartRestartGroup, 6), null, null, null, 0, composerStartRestartGroup, (i5 << 12) | 3120 | (i5 << 15), 0, 65472);
            composer2 = composerStartRestartGroup;
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bb(bleValidationLayoutInfo2, i, i3));
        }
    }

    public static final void I(BleValidationLayoutInfo bleValidationLayoutInfo, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        Composer composer2;
        int i3;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654533462);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654533462, i4, -1, "app.chalo.validationsdk.blevalidation.ui.SwitchToQrValidationFooterContent (BleValidationScreen.android.kt:1109)");
            }
            SwitchToQrValidationLayoutInfo switchToQrValidationLayoutInfo = bleValidationLayoutInfo.b;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(switchToQrValidationLayoutInfo.d ? 1.0f : 0.4f, null, 0.0f, "", null, composerStartRestartGroup, 3072, 22);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY_I_WILL_TAP_CAPS, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int i6 = i4 & 112;
            boolean z = i6 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ya(function1, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC2, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer2 = composerStartRestartGroup;
            ChaloSpacersKt.n(composer2, 0);
            if (switchToQrValidationLayoutInfo.c) {
                composer2.startReplaceGroup(813059556);
                if (switchToQrValidationLayoutInfo.d) {
                    composer2.startReplaceGroup(-1636334485);
                    strC = StringResourcesHelperKt.c(StringEnum.USE_QR_CODE, new Object[0], composer2, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.h(strC, "toUpperCase(...)");
                    composer2.endReplaceGroup();
                    i3 = 1;
                } else {
                    composer2.startReplaceGroup(-1636333075);
                    i3 = 1;
                    strC = StringResourcesHelperKt.c(StringEnum.QR_AVL_DELAY_COPY, new Object[]{String.valueOf((switchToQrValidationLayoutInfo.b / ((long) 1000)) % ((long) 60))}, composer2, 6);
                    composer2.endReplaceGroup();
                }
                String str = strC;
                Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, i3, null), stateAnimateFloatAsState.getValue().floatValue());
                if (i6 != 32) {
                    i3 = 0;
                }
                Object objRememberedValue2 = composer2.rememberedValue();
                if (i3 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    function2 = function1;
                    objRememberedValue2 = new ya(function2, 19);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    function2 = function1;
                }
                ChaloFilledButtonKt.f(str, false, modifierAlpha, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composer2, 0, 122);
                composer2 = composer2;
            } else {
                function2 = function1;
                composer2.startReplaceGroup(773673250);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new db(bleValidationLayoutInfo, function2, i, 4));
        }
    }

    public static final void J(BleValidationLayoutInfo bleValidationLayoutInfo, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(653896649);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(653896649, i2, -1, "app.chalo.validationsdk.blevalidation.ui.SwitchToQrValidationFooterUI (BleValidationScreen.android.kt:1089)");
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(ChaloTheme.b(composerStartRestartGroup, 0).e, ChaloTheme.b(composerStartRestartGroup, 0).e, 0.0f, 0.0f, 12, null), ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, ComposableLambdaKt.rememberComposableLambda(266211786, true, new d0(1, bleValidationLayoutInfo, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new db(bleValidationLayoutInfo, function1, i, 2));
        }
    }

    public static final void K(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(591790402);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591790402, i2, -1, "app.chalo.validationsdk.blevalidation.ui.TapHereSection (BleValidationScreen.android.kt:701)");
            }
            String strC = StringResourcesHelperKt.c(StringEnum.NOT_ABLE_TO_VERIFY, new Object[0], composerStartRestartGroup, 6);
            String strC2 = StringResourcesHelperKt.c(StringEnum.TAP_HERE, new Object[0], composerStartRestartGroup, 6);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            long j2 = ChaloTheme.a(composerStartRestartGroup, 0).B;
            FontWeight fontWeight = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight();
            FontWeight fontWeight2 = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)).getFontWeight();
            long jM6771getFontSizeXSAIIZE = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).m6771getFontSizeXSAIIZE();
            FontFamily fontFamily = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)).getFontFamily();
            FontFamily fontFamily2 = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)).getFontFamily();
            boolean zChanged = composerStartRestartGroup.changed(strC) | composerStartRestartGroup.changed(strC2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(new SpanStyle(j, jM6771getFontSizeXSAIIZE, fontWeight, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65496, (DefaultConstructorMarker) null));
                try {
                    builder.append(strC);
                    builder.pop(iPushStyle);
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(j2, jM6771getFontSizeXSAIIZE, fontWeight2, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65496, (DefaultConstructorMarker) null));
                    try {
                        builder.append(strC2);
                        builder.pop(iPushStyle2);
                        int iD = StringsKt.D(strC + strC2, strC2, 0, false, 6);
                        builder.addStringAnnotation("ClickableText", "", iD, strC2.length() + iD);
                        objRememberedValue = builder.toAnnotatedString();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            }
            AnnotatedString annotatedString = (AnnotatedString) objRememberedValue;
            TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7168getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null);
            boolean zChanged2 = composerStartRestartGroup.changed(annotatedString) | ((i2 & 14) == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new jb(annotatedString, function0, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ClickableTextKt.m1101ClickableText4YKlhWE(annotatedString, null, textStyle, false, 0, 0, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 0, function0));
        }
    }

    public static final void L(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1678931316);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1678931316, i3, -1, "app.chalo.validationsdk.blevalidation.ui.TapToValidateTutorialBottomsheetContent (BleValidationScreen.android.kt:1440)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloTheme.a(composerStartRestartGroup, 0).s, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strC = StringResourcesHelperKt.c(StringEnum.VALIDATION_INFO_SCREEN_TITLE, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleA = ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            int iM7168getCentere0LSkKk = TextAlign.INSTANCE.m7168getCentere0LSkKk();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, columnScopeInstance.align(companion3, companion.getCenterHorizontally()), j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleA, composerStartRestartGroup, 0, 0, 130040);
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(LottieType.TAP_TUTORIAL_GIF, composerStartRestartGroup, 6), Integer.MAX_VALUE, false, composerStartRestartGroup, 48, 28), (String) null, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 432, 120);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), StringResourcesHelperKt.c(StringEnum.BUTTON_TEXT_GOT_IT, new Object[0], composerStartRestartGroup, 6), null, 0L, null, true, 0.0f, null, 0L, function0, composerStartRestartGroup, ((i3 << 24) & 1879048192) | 196614, 476);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier, function0, i, 0));
        }
    }

    public static final void M(String str, String str2, String str3, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2104267750);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2104267750, i2, -1, "app.chalo.validationsdk.blevalidation.ui.TicketDetailsContentUI (BleValidationScreen.android.kt:667)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).A, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).g);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).h;
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(str, null, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleD, composerStartRestartGroup, i2 & 14, 0, 130042);
            Composer composer3 = composerStartRestartGroup;
            if (str3.length() > 0) {
                composer3.startReplaceGroup(-1479736489);
                TextKt.m2623TextNvy7gAk(str3, null, ChaloTheme.a(composer3, 0).g, null, TextUnitKt.getSp(24), null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.e(ChaloTheme.e(composer3, 0))), composer3, ((i4 >> 6) & 14) | 24576, 0, 130026);
                composer3 = composer3;
            } else {
                composer3.startReplaceGroup(-1505182746);
            }
            composer3.endReplaceGroup();
            composer2 = composer3;
            TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composer3, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer3, 0)), composer2, (i4 >> 3) & 14, 0, 130042);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new pb(i, 1, str, str2, str3));
        }
    }

    public static final void N(String str, String str2, String str3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-438110897);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438110897, i2, -1, "app.chalo.validationsdk.blevalidation.ui.TicketDetailsUI (BleValidationScreen.android.kt:650)");
            }
            ChaloRoundedCardKt.b(null, ChaloTheme.d(composerStartRestartGroup, 0).b, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-11117936, true, new ob(0, str, str2, str3), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pb(i, 0, str, str2, str3));
        }
    }

    public static final void a(BleValidationLayoutInfo bleValidationLayoutInfo, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(854788516);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(854788516, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BaseValidationContent (BleValidationScreen.android.kt:500)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierA = dq.a(ColumnScopeInstance.INSTANCE, ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            b(bleValidationLayoutInfo, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.endNode();
            c(bleValidationLayoutInfo, function1, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new db(bleValidationLayoutInfo, function1, i, 0));
        }
    }

    public static final void b(BleValidationLayoutInfo bleValidationLayoutInfo, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1599946347);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1599946347, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BaseValidationContentUI (BleValidationScreen.android.kt:526)");
            }
            ChaloSpacersKt.j(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLE_VALIDATION_TITLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 0, 0, 130042);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.k(composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).l, 0.0f, 2, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = CoilGifUtils.a(context).a();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            String str = bleValidationLayoutInfo.f10606a.f10566a;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            IconType iconType = IconType.BLE_PLACEHOLDER_VALIDATION_SCREEN;
            Painter painterA = IconAssetHelper_androidKt.a(iconType, composerStartRestartGroup, 6);
            Painter painterA2 = IconAssetHelper_androidKt.a(iconType, composerStartRestartGroup, 6);
            int i4 = Painter.$stable;
            AsyncImageKt.b(str, null, (ImageLoader) objRememberedValue, modifierFillMaxSize$default, painterA, painterA2, null, null, null, 0, composerStartRestartGroup, (i4 << 12) | 3120 | (i4 << 15), 0, 65472);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bb(bleValidationLayoutInfo, i, 2));
        }
    }

    public static final void c(BleValidationLayoutInfo bleValidationLayoutInfo, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-155387766);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-155387766, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BaseValidationFooterUI (BleValidationScreen.android.kt:558)");
            }
            if (bleValidationLayoutInfo.f10606a.f) {
                composerStartRestartGroup.startReplaceGroup(818042544);
                boolean z = (i2 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ya(function1, 11);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                K((Function0) objRememberedValue, composerStartRestartGroup, 0);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(796214328);
            }
            composerStartRestartGroup.endReplaceGroup();
            String str = bleValidationLayoutInfo.f10606a.c.f;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(818262984);
            } else {
                composerStartRestartGroup.startReplaceGroup(818262985);
                A(bleValidationLayoutInfo, function1, str, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new db(bleValidationLayoutInfo, function1, i, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1460396301);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1460396301, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleToolbarDisplayOptions (BleValidationScreen.android.kt:241)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new t1(mutableState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, null, ComposableSingletons$BleValidationScreen_androidKt.c, composerStartRestartGroup, 1572870, 62);
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new t1(mutableState, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion2, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-675854940, true, new d0(i4, function1, mutableState), composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            i3 = 2;
            AndroidMenu_androidKt.m1619DropdownMenuIlH_yew(zBooleanValue, (Function0) objRememberedValue3, modifierM264backgroundbw27NRU$default, 0L, null, null, null, 0L, 0.0f, 0.0f, null, composableLambdaRememberComposableLambda, composer2, 48, 48, 2040);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 2;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, i3, function1));
        }
    }

    public static final void e(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1871235562);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1871235562, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleToolbarDisplayToolbar (BleValidationScreen.android.kt:218)");
            }
            ChaloToolBarKt.a(ComposableSingletons$BleValidationScreen_androidKt.f10611a, null, Dp.m7278constructorimpl(0), 0L, ComposableLambdaKt.rememberComposableLambda(-1878115179, true, new ab(function1, 1), composerStartRestartGroup, 54), null, composerStartRestartGroup, 24966, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, 1, function1));
        }
    }

    public static final void f(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1004573316);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1004573316, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleTurnOnFullScreenExplainerContent (BleValidationScreen.android.kt:762)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(dq.a(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).l, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            g(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            i(function1, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, 0, function1));
        }
    }

    public static final void g(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-493974867);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-493974867, i, -1, "app.chalo.validationsdk.blevalidation.ui.BleTurnOnFullScreenExplainerContentUI (BleValidationScreen.android.kt:786)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1294094320);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResourcesHelperKt.c(StringEnum.TURN_ON_BLUETOOTH, new Object[0], composerStartRestartGroup, 6));
            builder.append(" ");
            ComposeUtilsKt.a(builder);
            builder.append(" ");
            builder.append(StringResourcesHelperKt.c(StringEnum.BLUETOOTH_TO_USE_TICKET, new Object[0], composerStartRestartGroup, 6));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextKt.m2624TextZ58ophY(annotatedString, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, ComposeUtilsKt.e(companion, CollectionsKt.R(IconType.IC_BLUETOOTH)), null, textStyleF, composerStartRestartGroup, 48, 0, 195576);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLUETOOTH_ENABLE_REQUIRED_INSTRUCTION, new Object[0], composerStartRestartGroup, 6), columnScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getCenterHorizontally()), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130040);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IMG_BLUETOOTH_ENABLE_RATIONALE, composerStartRestartGroup, 6), "", columnScopeInstance.align(companion, companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 1));
        }
    }

    public static final void h(Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        Function1 function2 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-363824523);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-363824523, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleTurnOnFullScreenExplainerFooterContentUI (BleValidationScreen.android.kt:850)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            String strC = StringResourcesHelperKt.c(StringEnum.TURN_ON_BLUETOOTH, new Object[0], composerStartRestartGroup, 6);
            int i5 = i2;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int i6 = i5 & 14;
            boolean z = i6 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ya(function2, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.USE_QR_CODE, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            i3 = 4;
            boolean z2 = i6 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ya(function1, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            function2 = function1;
            ChaloFilledButtonKt.f(strC2, false, modifierFillMaxWidth$default2, null, null, 0.0f, 0L, function0, composerStartRestartGroup, 384, 122);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 4;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, i3, function2));
        }
    }

    public static final void i(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-751159630);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-751159630, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleTurnOnFullScreenExplainerFooterUI (BleValidationScreen.android.kt:832)");
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(ChaloTheme.b(composerStartRestartGroup, 0).e, ChaloTheme.b(composerStartRestartGroup, 0).e, 0.0f, 0.0f, 12, null), ChaloTheme.c(composerStartRestartGroup, 0).d, 0.0f, ComposableLambdaKt.rememberComposableLambda(25476787, true, new ab(function1, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, 3, function1));
        }
    }

    public static final void j(final BleValidationState bleValidationState, SheetState sheetState, SheetState sheetState2, final Function1 function1, Composer composer, int i) {
        int i2;
        SheetState sheetState3;
        SheetState sheetState4;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-16129615);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sheetState3 = sheetState;
            i2 |= composerStartRestartGroup.changed(sheetState3) ? 32 : 16;
        } else {
            sheetState3 = sheetState;
        }
        if ((i & 384) == 0) {
            sheetState4 = sheetState2;
            i2 |= composerStartRestartGroup.changed(sheetState4) ? 256 : 128;
        } else {
            sheetState4 = sheetState2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-16129615, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationBottomSheetHandling (BleValidationScreen.android.kt:175)");
            }
            switch (WhenMappings.f10609a[bleValidationState.d.ordinal()]) {
                case 1:
                    composerStartRestartGroup.startReplaceGroup(519284271);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                case 3:
                    composerStartRestartGroup.startReplaceGroup(519431273);
                    z = (i2 & 7168) == 2048;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ya(function1, 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final int i3 = 0;
                    ChaloRoundedBottomSheetKt.a(sheetState3, (Function0) objRememberedValue, true, false, false, ComposableLambdaKt.rememberComposableLambda(2037202936, true, new Function3() { // from class: za
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i4 = i3;
                            ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i4) {
                                case 0:
                                    Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2037202936, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationBottomSheetHandling.<anonymous> (BleValidationScreen.android.kt:184)");
                                        }
                                        BleValidationScreen_androidKt.k(bleValidationState, function1, null, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2021594537, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationBottomSheetHandling.<anonymous> (BleValidationScreen.android.kt:202)");
                                        }
                                        BleValidationScreen_androidKt.k(bleValidationState, function1, null, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 196992, 24);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    composerStartRestartGroup.startReplaceGroup(520253982);
                    z = (i2 & 7168) == 2048;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ya(function1, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final int i4 = 1;
                    ChaloRoundedBottomSheetKt.a(sheetState4, (Function0) objRememberedValue2, false, false, false, ComposableLambdaKt.rememberComposableLambda(-2021594537, true, new Function3() { // from class: za
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i5 = i4;
                            ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i5) {
                                case 0:
                                    Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2037202936, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationBottomSheetHandling.<anonymous> (BleValidationScreen.android.kt:184)");
                                        }
                                        BleValidationScreen_androidKt.k(bleValidationState, function1, null, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2021594537, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationBottomSheetHandling.<anonymous> (BleValidationScreen.android.kt:202)");
                                        }
                                        BleValidationScreen_androidKt.k(bleValidationState, function1, null, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 196992, 24);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, 1679317735);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 2, bleValidationState, sheetState, sheetState2, function1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0297  */
    public static final void k(BleValidationState viewState, Function1 sendIntent, Modifier modifier, Composer composer, int i) {
        int i2;
        Object obj;
        Modifier.Companion companion;
        boolean z;
        Intrinsics.i(viewState, "viewState");
        BleValidationBottomsheetInfo bleValidationBottomsheetInfo = viewState.e;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(475407889);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(475407889, i3, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheet (BleValidationScreen.android.kt:278)");
            }
            switch (WhenMappings.f10609a[viewState.d.ordinal()]) {
                case 1:
                    companion = companion2;
                    composerStartRestartGroup.startReplaceGroup(-1925475921);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = companion;
                    break;
                case 2:
                    composerStartRestartGroup.startReplaceGroup(-1922390398);
                    RideRatingBottomsheetInfo rideRatingBottomsheetInfo = bleValidationBottomsheetInfo != null ? bleValidationBottomsheetInfo.d : null;
                    if (rideRatingBottomsheetInfo == null) {
                        composerStartRestartGroup.startReplaceGroup(-1922390399);
                        composerStartRestartGroup.endReplaceGroup();
                        companion = companion2;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1922390398);
                        int i4 = rideRatingBottomsheetInfo.f10620a;
                        IconType iconType = IconType.RATE;
                        String strC = StringResourcesHelperKt.c(StringEnum.RIDE_RATING_BOTTOMSHEET_TITLE, new Object[0], composerStartRestartGroup, 6);
                        String strC2 = StringResourcesHelperKt.c(StringEnum.RIDE_RATING_BOTTOMSHEET_SUBTITLE, new Object[0], composerStartRestartGroup, 6);
                        List list = rideRatingBottomsheetInfo.c;
                        String strC3 = StringResourcesHelperKt.c(StringEnum.SUBMIT, new Object[0], composerStartRestartGroup, 6);
                        int i5 = i3 & 112;
                        boolean z2 = i5 == 32;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new g0(sendIntent, 6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        z = i5 == 32;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ab(sendIntent, 0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        companion = companion2;
                        UserRatingBottomSheetKt.a(i4, iconType, strC, strC2, list, strC3, function1, (Function3) objRememberedValue2, null, composerStartRestartGroup, 48, 256);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = companion;
                    break;
                case 3:
                    companion2 = companion2;
                    composerStartRestartGroup.startReplaceGroup(-1925346310);
                    if (bleValidationBottomsheetInfo == null) {
                        composerStartRestartGroup.startReplaceGroup(-1925346311);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1925346310);
                        C(bleValidationBottomsheetInfo.f10567a, sendIntent, companion2, composerStartRestartGroup, i3 & 1008);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = companion;
                    break;
                case 4:
                    companion2 = companion2;
                    composerStartRestartGroup.startReplaceGroup(-1924923501);
                    if (bleValidationBottomsheetInfo == null) {
                        composerStartRestartGroup.startReplaceGroup(-1924923502);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1924923501);
                        NearbyDevicesAndPermissionRationaleBottomsheetInfo nearbyDevicesAndPermissionRationaleBottomsheetInfo = bleValidationBottomsheetInfo.b;
                        z = (i3 & 112) == 32;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ya(sendIntent, 2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        v(nearbyDevicesAndPermissionRationaleBottomsheetInfo, (Function0) objRememberedValue3, companion2, composerStartRestartGroup, i3 & 896);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = companion;
                    break;
                case 5:
                    companion2 = companion2;
                    composerStartRestartGroup.startReplaceGroup(-1924358371);
                    if (bleValidationBottomsheetInfo == null) {
                        composerStartRestartGroup.startReplaceGroup(-1924358372);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1924358371);
                        z = (i3 & 112) == 32;
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new ya(sendIntent, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        L((i3 >> 6) & 14, composerStartRestartGroup, companion2, (Function0) objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = companion;
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(-1923976327);
                    if (bleValidationBottomsheetInfo == null) {
                        composerStartRestartGroup.startReplaceGroup(-1923976328);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1923976327);
                        StringEnum stringEnum = StringEnum.VIEW_RECEIPT_BOTTOMSHEET_TITLE;
                        StringEnum stringEnum2 = bleValidationBottomsheetInfo.c.f10614a;
                        int i6 = i3 & 112;
                        boolean z3 = i6 == 32;
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new ya(sendIntent, 4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        Function0 function0 = (Function0) objRememberedValue5;
                        z = i6 == 32;
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new ya(sendIntent, 5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        y(stringEnum, stringEnum2, companion2, function0, (Function0) objRememberedValue6, composerStartRestartGroup, (i3 & 896) | 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = companion;
                    break;
                case 7:
                    composerStartRestartGroup.startReplaceGroup(-1923174357);
                    if (bleValidationBottomsheetInfo == null) {
                        composerStartRestartGroup.startReplaceGroup(-1923174358);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1923174357);
                        StringEnum stringEnum3 = StringEnum.VIEW_RECEIPT_BOTTOMSHEET_TITLE_FOR_TAP_OUT_SUCCESS;
                        StringEnum stringEnum4 = StringEnum.VIEW_RECEIPT_BOTTOMSHEET_COPY_FOR_TAP_OUT_SUCCESS;
                        int i7 = i3 & 112;
                        boolean z4 = i7 == 32;
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new ya(sendIntent, 6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        Function0 function2 = (Function0) objRememberedValue7;
                        z = i7 == 32;
                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new ya(sendIntent, 7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        y(stringEnum3, stringEnum4, companion2, function2, (Function0) objRememberedValue8, composerStartRestartGroup, (i3 & 896) | 54);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = companion;
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, 1600457232);
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            obj = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 2, viewState, sendIntent, obj));
        }
    }

    public static final void l(BleValidationState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        BleValidationDialogInfo bleValidationDialogInfo = viewState.g;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1393863242);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1393863242, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationDialog (BleValidationScreen.android.kt:477)");
            }
            if (!viewState.f || bleValidationDialogInfo == null) {
                composerStartRestartGroup.startReplaceGroup(-854849876);
            } else {
                composerStartRestartGroup.startReplaceGroup(-835786240);
                String strC = StringResourcesHelperKt.c(bleValidationDialogInfo.f10568a, new Object[0], composerStartRestartGroup, 0);
                String strC2 = StringResourcesHelperKt.c(bleValidationDialogInfo.b, new Object[0], composerStartRestartGroup, 0);
                String strC3 = StringResourcesHelperKt.c(bleValidationDialogInfo.c, new Object[0], composerStartRestartGroup, 0);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ya(sendIntent, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                String strC4 = StringResourcesHelperKt.c(bleValidationDialogInfo.d, new Object[0], composerStartRestartGroup, 0);
                boolean z2 = i3 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ya(sendIntent, 14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ChaloConfirmationDialogKt.b(strC, strC2, strC3, function0, strC4, (Function0) objRememberedValue2, null, null, composerStartRestartGroup, 0, 192);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new lb(viewState, sendIntent, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(BleValidationFragmentComponent bleValidationFragmentComponent, Composer composer, int i) {
        int i2;
        BleValidationFragmentComponent bleValidationFragmentComponent2;
        int i3;
        MutableState mutableState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1399847681);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bleValidationFragmentComponent) : composerStartRestartGroup.changedInstance(bleValidationFragmentComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1399847681, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationScreen (BleValidationScreen.android.kt:112)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(bleValidationFragmentComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateA = SheetDefaultsHelperKt.a(true, null, SheetValue.Hidden, false, composerStartRestartGroup, 390, 58);
            SheetState sheetStateA2 = SheetDefaultsHelperKt.a(true, null, sheetStateA.getCurrentValue(), false, composerStartRestartGroup, 6, 58);
            ComposeUtils_androidKt.a(composerStartRestartGroup, 0);
            BleValidationState bleValidationState = (BleValidationState) mutableStateA.getValue();
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(bleValidationFragmentComponent));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                mutableState = mutableStateA;
                BleValidationScreen_androidKt$BleValidationScreen$1$1 bleValidationScreen_androidKt$BleValidationScreen$1$1 = new BleValidationScreen_androidKt$BleValidationScreen$1$1(1, bleValidationFragmentComponent, BleValidationFragmentComponent.class, "processIntent", "processIntent(Ljava/lang/Object;)V", 0);
                composerStartRestartGroup.updateRememberedValue(bleValidationScreen_androidKt$BleValidationScreen$1$1);
                objRememberedValue = bleValidationScreen_androidKt$BleValidationScreen$1$1;
            } else {
                mutableState = mutableStateA;
                i3 = 0;
            }
            j(bleValidationState, sheetStateA, sheetStateA2, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            BleValidationBottomsheetType bleValidationBottomsheetType = ((BleValidationState) mutableState.getValue()).d;
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(sheetStateA) | composerStartRestartGroup.changed(sheetStateA2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new BleValidationScreen_androidKt$BleValidationScreen$2$1(sheetStateA, sheetStateA2, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(bleValidationBottomsheetType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            int i5 = (i4 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(bleValidationFragmentComponent))) ? 1 : i3;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i5 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new i4(bleValidationFragmentComponent, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue3, 0, 0, composerStartRestartGroup, 3);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if ((composerStartRestartGroup.getApplier() != null ? 1 : i3) == 0) {
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i7 = (i4 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(bleValidationFragmentComponent))) ? 1 : i3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i7 != 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                bleValidationFragmentComponent2 = bleValidationFragmentComponent;
                BleValidationScreen_androidKt$BleValidationScreen$4$1$1 bleValidationScreen_androidKt$BleValidationScreen$4$1$1 = new BleValidationScreen_androidKt$BleValidationScreen$4$1$1(1, bleValidationFragmentComponent2, BleValidationFragmentComponent.class, "processIntent", "processIntent(Ljava/lang/Object;)V", 0);
                composerStartRestartGroup.updateRememberedValue(bleValidationScreen_androidKt$BleValidationScreen$4$1$1);
                objRememberedValue4 = bleValidationScreen_androidKt$BleValidationScreen$4$1$1;
            } else {
                bleValidationFragmentComponent2 = bleValidationFragmentComponent;
            }
            e((Function1) ((KFunction) objRememberedValue4), composerStartRestartGroup, i3);
            BleValidationState bleValidationState2 = (BleValidationState) mutableState.getValue();
            int i8 = (i4 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(bleValidationFragmentComponent2))) ? 1 : i3;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new BleValidationScreen_androidKt$BleValidationScreen$4$2$1(1, bleValidationFragmentComponent2, BleValidationFragmentComponent.class, "processIntent", "processIntent(Ljava/lang/Object;)V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            n(bleValidationState2, (Function1) ((KFunction) objRememberedValue5), composerStartRestartGroup, i3);
            composerStartRestartGroup.endNode();
            BleValidationState bleValidationState3 = (BleValidationState) mutableState.getValue();
            int i9 = (i4 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(bleValidationFragmentComponent2))) ? 1 : i3;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new BleValidationScreen_androidKt$BleValidationScreen$5$1(1, bleValidationFragmentComponent2, BleValidationFragmentComponent.class, "processIntent", "processIntent(Ljava/lang/Object;)V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            l(bleValidationState3, (Function1) ((KFunction) objRememberedValue6), composerStartRestartGroup, i3);
            if (((BleValidationState) mutableState.getValue()).h) {
                composerStartRestartGroup.startReplaceGroup(-1268179491);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1275427167);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            bleValidationFragmentComponent2 = bleValidationFragmentComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(bleValidationFragmentComponent2, i, 3));
        }
    }

    public static final void n(BleValidationState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-175434262);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175434262, i2, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationUi (BleValidationScreen.android.kt:367)");
            }
            p(viewState, composerStartRestartGroup, i2 & 14);
            BleValidationLayoutType bleValidationLayoutType = viewState.f10610a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g(viewState, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AnimatedContentKt.AnimatedContent(bleValidationLayoutType, null, (Function1) objRememberedValue, null, "", null, ComposableLambdaKt.rememberComposableLambda(-318227241, true, new rb(0, viewState, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, 1597440, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lb(viewState, sendIntent, i, 1));
        }
    }

    public static final void o(ProductDetailsDisplayFieldData productDetailsDisplayFieldData, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2110517691);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(productDetailsDisplayFieldData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2110517691, i2, -1, "app.chalo.validationsdk.blevalidation.ui.FieldDataUI (BleValidationScreen.android.kt:1344)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(productDetailsDisplayFieldData.f10617a, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 48, 0, 131064);
            TextKt.m2623TextNvy7gAk(productDetailsDisplayFieldData.b, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer2, 0)), composer2, 48, 0, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(productDetailsDisplayFieldData, i, 4));
        }
    }

    public static final void p(final BleValidationState bleValidationState, Composer composer, final int i) {
        int i2;
        Painter painterA;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520502800);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520502800, i2, -1, "app.chalo.validationsdk.blevalidation.ui.HandleDebuggingLogs (BleValidationScreen.android.kt:427)");
            }
            if (bleValidationState.i.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: eb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    BleValidationScreen_androidKt.p(bleValidationState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    BleValidationScreen_androidKt.p(bleValidationState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion2, ((Boolean) mutableState.getValue()).booleanValue() ? Dp.m7278constructorimpl(350) : Dp.m7278constructorimpl(32)), 0.0f, 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new t1(mutableState, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue2, 15, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk("BLE Debugging Messages", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 6, 0, 262142);
            composerStartRestartGroup = composerStartRestartGroup;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(497476268);
                painterA = PainterResourceHelperKt.a(IconType.ARROW_UP_TRIPPLANNER_DETAILS, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(497479022);
                painterA = PainterResourceHelperKt.a(IconType.ARROW_DOWN_TRIPPLANNER_DETAILS, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            ImageKt.Image(painterA, "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            composerStartRestartGroup.endNode();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-267851412);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                composerStartRestartGroup.startReplaceGroup(-1425488556);
                Iterator it = bleValidationState.i.iterator();
                while (it.hasNext()) {
                    Composer composer2 = composerStartRestartGroup;
                    TextKt.m2623TextNvy7gAk((String) it.next(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(-286456434);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i8 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: eb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i8;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i9) {
                        case 0:
                            BleValidationScreen_androidKt.p(bleValidationState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            BleValidationScreen_androidKt.p(bleValidationState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void q(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1494096655);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1494096655, i, -1, "app.chalo.validationsdk.blevalidation.ui.NearbyDevicesContent (BleValidationScreen.android.kt:941)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.NEARBY_DEVICES_PERMISSION_PLACEHOLDER, composerStartRestartGroup, 6), "", (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 108);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLE_PERM_INSTRUCTION_1, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131066);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLE_PERM_INSTRUCTION_2, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLE_PERM_INSTRUCTION_3, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 4));
        }
    }

    public static final void r(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(881174040);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(881174040, i, -1, "app.chalo.validationsdk.blevalidation.ui.NearbyDevicesFullScreenContentUI (BleValidationScreen.android.kt:930)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).A, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            q(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 3));
        }
    }

    public static final void s(int i, Composer composer, Function1 function1, boolean z) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-656675073);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-656675073, i2, -1, "app.chalo.validationsdk.blevalidation.ui.NearbyDevicesFullScreenExplainerContent (BleValidationScreen.android.kt:874)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical bottom = arrangement.getBottom();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(bottom, companion2.getStart(), composerStartRestartGroup, 6);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(dq.a(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            t(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            u(i2 & WebSocketProtocol.PAYLOAD_SHORT, composerStartRestartGroup, function1, z);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb(function1, z, i, 0));
        }
    }

    public static final void t(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1559657626);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1559657626, i, -1, "app.chalo.validationsdk.blevalidation.ui.NearbyDevicesFullScreenExplainerContentUI (BleValidationScreen.android.kt:894)");
            }
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(112611410);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResourcesHelperKt.c(StringEnum.ALLOW, new Object[0], composerStartRestartGroup, 6));
            builder.append(" ");
            ComposeUtilsKt.a(builder);
            builder.append(" ");
            builder.append(StringResourcesHelperKt.c(StringEnum.NEARBY_DEVICES, new Object[0], composerStartRestartGroup, 6));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            TextKt.m2624TextZ58ophY(annotatedString, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, ComposeUtilsKt.e(companion, CollectionsKt.R(IconType.IC_NEARBY_DEVICES)), null, textStyleF, composerStartRestartGroup, 48, 0, 195576);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLE_PERM_RATIONALE_INSTRUCTION, new Object[0], composerStartRestartGroup, 6), PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130040);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            r(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 2));
        }
    }

    public static final void u(int i, Composer composer, Function1 function1, boolean z) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1211771591);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1211771591, i2, -1, "app.chalo.validationsdk.blevalidation.ui.NearbyDevicesFullScreenExplainerFooterUI (BleValidationScreen.android.kt:979)");
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, ChaloTheme.c(composerStartRestartGroup, 0).e, 0.0f, ComposableLambdaKt.rememberComposableLambda(-511985336, true, new z4(function1, z, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb(function1, z, i, 1));
        }
    }

    public static final void v(NearbyDevicesAndPermissionRationaleBottomsheetInfo nearbyDevicesAndPermissionRationaleBottomsheetInfo, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(157001459);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(nearbyDevicesAndPermissionRationaleBottomsheetInfo) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(157001459, i2, -1, "app.chalo.validationsdk.blevalidation.ui.NearbyPermissionsRationaleBottomsheetContent (BleValidationScreen.android.kt:1370)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(modifier, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            composerStartRestartGroup.startReplaceGroup(-1083646079);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResourcesHelperKt.c(StringEnum.ALLOW, new Object[0], composerStartRestartGroup, 6));
            builder.append(" ");
            ComposeUtilsKt.a(builder);
            builder.append(" ");
            builder.append(StringResourcesHelperKt.c(StringEnum.NEARBY_DEVICES, new Object[0], composerStartRestartGroup, 6));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int i4 = i2;
            TextKt.m2624TextZ58ophY(annotatedString, modifierFillMaxWidth$default2, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, ComposeUtilsKt.e(companion3, CollectionsKt.R(IconType.IC_NEARBY_DEVICES)), null, textStyleF, composerStartRestartGroup, 48, 0, 195576);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BLE_PERM_RATIONALE_BOTTOMSHEET_COPY, new Object[0], composerStartRestartGroup, 6), columnScopeInstance.align(companion3, companion.getCenterHorizontally()), ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130040);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = CoilGifUtils.a(context).a();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            String str = nearbyDevicesAndPermissionRationaleBottomsheetInfo.f10613a;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            IconType iconType = IconType.NEARBY_DEVICES_PERMISSION_PLACEHOLDER;
            Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 6);
            Painter painterA2 = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 6);
            int i6 = Painter.$stable;
            AsyncImageKt.b(str, null, (ImageLoader) objRememberedValue, modifierFillMaxSize$default, painterA, painterA2, null, null, null, 0, composerStartRestartGroup, (i6 << 12) | 3120 | (i6 << 15), 0, 65472);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), StringResourcesHelperKt.c(StringEnum.ALLOW_CAPS, new Object[0], composerStartRestartGroup, 6), null, 0L, null, true, 0.0f, null, 0L, function0, composerStartRestartGroup, ((i4 << 24) & 1879048192) | 196614, 476);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 3, nearbyDevicesAndPermissionRationaleBottomsheetInfo, function0, modifier));
        }
    }

    public static final void w(ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1616243673);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productDetailsDisplayPassengerFieldData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1616243673, i2, -1, "app.chalo.validationsdk.blevalidation.ui.PassengerDetails (BleValidationScreen.android.kt:1280)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            if (productDetailsDisplayPassengerFieldData.f10618a.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-1642944662);
                String str = productDetailsDisplayPassengerFieldData.f10618a;
                Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape()), Dp.m7278constructorimpl(99));
                IconType iconType = IconType.PROFILE_EMPTY;
                Painter painterA = IconAssetHelper_androidKt.a(iconType, composerStartRestartGroup, 6);
                Painter painterA2 = IconAssetHelper_androidKt.a(iconType, composerStartRestartGroup, 6);
                int i4 = Painter.$stable;
                SingletonAsyncImageKt.b(str, null, modifierM828size3ABfNKs, painterA, painterA2, null, composerStartRestartGroup, (i4 << 9) | 48 | (i4 << 12), 32736);
                ChaloSpacersKt.y(composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1688099603);
            }
            composerStartRestartGroup.endReplaceGroup();
            x(productDetailsDisplayPassengerFieldData, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qb(productDetailsDisplayPassengerFieldData, i, 0));
        }
    }

    public static final void x(ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Gender gender;
        Object obj;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(993723885);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(productDetailsDisplayPassengerFieldData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(993723885, i2, -1, "app.chalo.validationsdk.blevalidation.ui.PassengerDetailsUI (BleValidationScreen.android.kt:1305)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = productDetailsDisplayPassengerFieldData.b;
            Gender gender2 = productDetailsDisplayPassengerFieldData.d;
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(28472212);
                gender = gender2;
                obj = null;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PASSENGER, new Object[0], composerStartRestartGroup, 6), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 0, 131064);
                TextKt.m2623TextNvy7gAk(productDetailsDisplayPassengerFieldData.b, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                gender = gender2;
                obj = null;
                composerStartRestartGroup.startReplaceGroup(-17382709);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (productDetailsDisplayPassengerFieldData.c.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(29030925);
                Composer composer3 = composerStartRestartGroup;
                i4 = 0;
                TextKt.m2623TextNvy7gAk(productDetailsDisplayPassengerFieldData.c, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composer3, 48, 0, 131064);
                composerStartRestartGroup = composer3;
            } else {
                i4 = 0;
                composerStartRestartGroup.startReplaceGroup(-17382709);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(29326293);
            String strC = StringResourcesHelperKt.c(GenderKt.a(gender), new Object[i4], composerStartRestartGroup, i4);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i4));
            long j = ChaloTheme.a(composerStartRestartGroup, i4).g;
            composer2 = composerStartRestartGroup;
            i3 = 1;
            TextKt.m2623TextNvy7gAk(strC, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, composer2, 48, 0, 131064);
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qb(productDetailsDisplayPassengerFieldData, i, i3));
        }
    }

    public static final void y(StringEnum stringEnum, StringEnum stringEnum2, Modifier modifier, Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(901250557);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stringEnum.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(stringEnum2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(901250557, i2, -1, "app.chalo.validationsdk.blevalidation.ui.PostValidationBottomsheetContent (BleValidationScreen.android.kt:1491)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(modifier, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(LottieType.VALIDATION_SUCCESS_LOTTIE, composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 120;
            ImageKt.Image(LottieResourceHelperKt.c(lottieCompositionResultImplB, 1, false, composerStartRestartGroup, 48, 28), (String) null, SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion2, Dp.m7278constructorimpl(f)), Dp.m7278constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 432, 120);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, i2 & 14);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).g;
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC, null, j, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleF, composerStartRestartGroup, 0, 0, 130042);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum2, new Object[0], composerStartRestartGroup, (i2 >> 3) & 14), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion3.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130042);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.VIEW_RECEIPT_CAPS, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z = (57344 & i2) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(function1, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default2, strC2, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            String strC3 = StringResourcesHelperKt.c(StringEnum.EXIT_CAPS, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z2 = (i2 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new hb(function0, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            ChaloFilledButtonKt.f(strC3, false, modifierFillMaxWidth$default3, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composer2, 384, 122);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) stringEnum, (Enum) stringEnum2, modifier, (Function) function0, (Object) function1, i, 2));
        }
    }

    public static final void z(BleValidationLayoutInfo bleValidationLayoutInfo, String str, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1812589769);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bleValidationLayoutInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1812589769, i2, -1, "app.chalo.validationsdk.blevalidation.ui.ProductAndTicketDetailsUI (BleValidationScreen.android.kt:600)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            E(i2 & 112, composerStartRestartGroup, i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), str);
            BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo = bleValidationLayoutInfo.f10606a;
            composerStartRestartGroup.startReplaceGroup(1482311438);
            BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo2 = bleValidationLayoutInfo.f10606a;
            N(bleValidationBasicLayoutInfo2.d, bleValidationBasicLayoutInfo2.e, bleValidationBasicLayoutInfo2.b, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(bleValidationLayoutInfo, str, i, 9));
        }
    }
}
