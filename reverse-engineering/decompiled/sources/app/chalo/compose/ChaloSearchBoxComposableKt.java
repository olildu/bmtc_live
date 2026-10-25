package app.chalo.compose;

import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.searchbar.SearchBarUiSpecs;
import app.chalo.uistate.searchbar.SearchBarUiState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.d0;
import defpackage.fj;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloSearchBoxComposableKt {
    public static final void a(Modifier modifier, SearchBarUiState searchUiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(searchUiState, "searchUiState");
        SearchBarUiSpecs searchBarUiSpecs = searchUiState.f10067a;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState = searchUiState.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-930884881);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(searchUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-930884881, i2, -1, "app.chalo.compose.ChaloSearchBoxComposable (ChaloSearchBoxComposable.kt:29)");
            }
            String str = textFieldUIState.f10099a;
            String str2 = textFieldUIState.f10099a;
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str2, TextRangeKt.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldValue textFieldValue = str2.length() == 0 ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : (TextFieldValue) ((MutableState) objRememberedValue).getValue();
            CardKt.Card(ChaloThemeKt.c(modifier, searchBarUiSpecs.c), ChaloThemeKt.d(searchBarUiSpecs.b), null, CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(searchBarUiSpecs.f10066a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CardDefaults.$stable << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(1590289341, true, new d0(17, searchUiState, textFieldValue), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(modifier, searchUiState, i, 13));
        }
    }
}
