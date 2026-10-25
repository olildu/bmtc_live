package defpackage;

import android.content.Context;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19086a;
    public final /* synthetic */ Context b;

    public /* synthetic */ q30(Context context, int i) {
        this.f19086a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19086a) {
            case 0:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$2(this.b);
            default:
                return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$5(this.b);
        }
    }
}
