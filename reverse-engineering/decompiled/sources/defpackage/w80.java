package defpackage;

import android.content.Context;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19903a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w80(Object obj, boolean z, Object obj2, int i) {
        this.f19903a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19903a) {
            case 0:
                return Http2Connection.ReaderRunnable.settings$lambda$3((Http2Connection.ReaderRunnable) this.c, this.b, (Settings) this.d);
            case 1:
                Context context = (Context) this.c;
                WorkManager.getInstance(context).enqueueUniqueWork("ExpeditedEncrkeySyncWorkOneTime", this.b ? ExistingWorkPolicy.REPLACE : ExistingWorkPolicy.KEEP, (OneTimeWorkRequest) this.d);
                return Unit.f17538a;
            default:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$14$lambda$13(this.b, (DrawerState) this.c, (CoroutineScope) this.d);
        }
    }

    public /* synthetic */ w80(boolean z, DrawerState drawerState, CoroutineScope coroutineScope) {
        this.f19903a = 2;
        this.b = z;
        this.c = drawerState;
        this.d = coroutineScope;
    }
}
