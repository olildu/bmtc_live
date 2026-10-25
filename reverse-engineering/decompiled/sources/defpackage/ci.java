package defpackage;

import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyIntent;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ci implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11332a;
    public final /* synthetic */ ChaloBusUserProfileSurveyComponent b;

    public /* synthetic */ ci(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, int i) {
        this.f11332a = i;
        this.b = chaloBusUserProfileSurveyComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecentPlaceAppModel it = (RecentPlaceAppModel) obj;
        switch (this.f11332a) {
            case 0:
                Intrinsics.i(it, "it");
                this.b.O0(new ChaloBusUserProfileSurveyIntent.WorkLocationSelected(it));
                break;
            default:
                Intrinsics.i(it, "it");
                this.b.O0(new ChaloBusUserProfileSurveyIntent.HomeLocationSelected(it));
                break;
        }
        return Unit.f17538a;
    }
}
