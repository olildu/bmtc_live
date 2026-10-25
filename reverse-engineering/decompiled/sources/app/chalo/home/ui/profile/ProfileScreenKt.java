package app.chalo.home.ui.profile;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.common.ChangeEnvironmentDialogKt;
import app.chalo.homescreen.data.model.app.ProfileScreenAppModel;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dy0;
import defpackage.ey0;
import defpackage.m;
import defpackage.vw0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProfileScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [app.chalo.buildconfig.ChaloBuildConfig, app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void a(ProfileScreenComponent profileScreenComponent, HomeScreenInfoHelper homeScreenInfoHelper, ProfileScreenAppModel profileScreenAppModel, Function0 onBackPressed, Composer composer, int i) {
        int i2;
        Object profileScreenKt$ProfileScreen$1$1;
        ?? r15;
        Intrinsics.i(homeScreenInfoHelper, "homeScreenInfoHelper");
        Intrinsics.i(profileScreenAppModel, "profileScreenAppModel");
        Intrinsics.i(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-851093156);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(profileScreenComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(profileScreenAppModel) : composerStartRestartGroup.changedInstance(profileScreenAppModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851093156, i3, -1, "app.chalo.home.ui.profile.ProfileScreen (ProfileScreen.kt:21)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            MutableState mutableStateA = SubscribeAsStateKt.a(profileScreenComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(profileScreenComponent) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                r15 = 0;
                profileScreenKt$ProfileScreen$1$1 = new ProfileScreenKt$ProfileScreen$1$1(profileScreenComponent, coroutineScope, sheetStateRememberModalBottomSheetState, homeScreenInfoHelper, null);
                composerStartRestartGroup.updateRememberedValue(profileScreenKt$ProfileScreen$1$1);
            } else {
                profileScreenKt$ProfileScreen$1$1 = objRememberedValue2;
                r15 = 0;
            }
            int i4 = i3 & 14;
            EffectsKt.LaunchedEffect(profileScreenComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) profileScreenKt$ProfileScreen$1$1, composerStartRestartGroup, i4);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(profileScreenComponent) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(profileScreenAppModel)));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ProfileScreenKt$ProfileScreen$2$1(profileScreenComponent, profileScreenAppModel, r15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(profileScreenComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i4);
            if (((ProfileScreenViewState) mutableStateA.getValue()).g) {
                composerStartRestartGroup.startReplaceGroup(-1722878297);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(profileScreenComponent);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new dy0(profileScreenComponent, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                ChangeEnvironmentDialogKt.a((Function0) objRememberedValue4, r15, r15, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1724927738);
            }
            composerStartRestartGroup.endReplaceGroup();
            ProfileScreenViewState profileScreenViewState = (ProfileScreenViewState) mutableStateA.getValue();
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(profileScreenComponent);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new vw0(profileScreenComponent, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function1 = (Function1) objRememberedValue5;
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changedInstance(profileScreenComponent) | ((i3 & 7168) == 2048);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new m(26, profileScreenComponent, onBackPressed, mutableStateA);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            ProfileScreenUIKt.j(profileScreenViewState, function1, (Function0) objRememberedValue6, sheetStateRememberModalBottomSheetState, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 0, profileScreenComponent, homeScreenInfoHelper, profileScreenAppModel, onBackPressed));
        }
    }
}
