package defpackage;

import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerUpdater;
import androidx.work.impl.model.WorkSpec;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.Owner;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15872a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i00(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z) {
        this.d = workDatabase;
        this.e = workSpec;
        this.f = workSpec2;
        this.g = list;
        this.b = str;
        this.h = set;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15872a) {
            case 0:
                ((DtbOmSdkSessionManager) this.d).lambda$initOmAdSession$2((CreativeType) this.e, (Owner) this.f, (Owner) this.g, this.c, (WebView) this.h, this.b);
                break;
            default:
                WorkerUpdater.updateWorkImpl$lambda$1((WorkDatabase) this.d, (WorkSpec) this.e, (WorkSpec) this.f, (List) this.g, this.b, (Set) this.h, this.c);
                break;
        }
    }

    public /* synthetic */ i00(DtbOmSdkSessionManager dtbOmSdkSessionManager, CreativeType creativeType, Owner owner, Owner owner2, boolean z, WebView webView, String str) {
        this.d = dtbOmSdkSessionManager;
        this.e = creativeType;
        this.f = owner;
        this.g = owner2;
        this.c = z;
        this.h = webView;
        this.b = str;
    }
}
