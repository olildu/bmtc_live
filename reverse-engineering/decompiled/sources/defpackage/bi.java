package defpackage;

import androidx.compose.runtime.ComposerKt;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState;
import app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyStepNavigator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bi implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11199a;
    public final /* synthetic */ PBUserProfileSurveyStepNavigator.Result b;

    public /* synthetic */ bi(PBUserProfileSurveyStepNavigator.Result result, int i) {
        this.f11199a = i;
        this.b = result;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11199a) {
            case 0:
                ChaloBusUserProfileSurveyDataState it = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it, "it");
                PBUserProfileSurveyStepNavigator.Result result = this.b;
                return ChaloBusUserProfileSurveyDataState.a(it, null, result.f1232a, result.b, false, null, null, false, ComposerKt.providerKey);
            default:
                ChaloBusUserProfileSurveyDataState it2 = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it2, "it");
                PBUserProfileSurveyStepNavigator.Result result2 = this.b;
                return ChaloBusUserProfileSurveyDataState.a(it2, null, result2.f1232a, result2.b, false, null, null, false, ComposerKt.providerKey);
        }
    }
}
