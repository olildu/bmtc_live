package app.chalo.compose.components.userprofile;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import defpackage.fl1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfilePicComposableKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1900a;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1900a = iArr;
        }
    }

    public static final void a(UserProfilePicComposableUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-346185320);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-346185320, i2, -1, "app.chalo.compose.components.userprofile.UserProfilePicComposable (UserProfilePicComposable.kt:29)");
            }
            UserProfilePicComposableUISpecs userProfilePicComposableUISpecs = uiState.f1902a;
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(userProfilePicComposableUISpecs.d);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(BorderUISpecKt.a(ClipKt.clip(ShadowKt.m4219shadows4CzXII$default(SizeKt.m828size3ABfNKs(companion, userProfilePicComposableUISpecs.f), userProfilePicComposableUISpecs.e, roundedCornerShapeD, false, 0L, 0L, 28, null), roundedCornerShapeD), userProfilePicComposableUISpecs.f1901a), ChaloColorTokenKt.c(userProfilePicComposableUISpecs.c), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            CommonImageKt.a(uiState.b, ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), userProfilePicComposableUISpecs.b), false, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(uiState, i, 20));
        }
    }

    public static ImageUIState b(Gender gender, float f, int i) {
        IconType iconTypeB;
        Gender fallbackGender = Gender.MALE;
        if ((i & 4) != 0) {
            f = ChaloThemeHelper.a().n;
        }
        Intrinsics.i(gender, "gender");
        Intrinsics.i(fallbackGender, "fallbackGender");
        int i2 = WhenMappings.f1900a[gender.ordinal()];
        if (i2 == 1) {
            iconTypeB = IconType.IC_USER_MALE;
        } else if (i2 == 2) {
            iconTypeB = IconType.IC_USER_FEMALE;
        } else if (i2 == 3) {
            iconTypeB = IconType.IC_USER_TRANSGENDER;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iconTypeB = GenderKt.b(fallbackGender, IconType.IC_USER_MALE);
        }
        return new ImageUIState(iconTypeB, (String) null, (ChaloColorToken) null, new ImageUISize(f), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230);
    }
}
