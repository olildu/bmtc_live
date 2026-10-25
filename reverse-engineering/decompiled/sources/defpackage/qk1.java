package defpackage;

import android.os.Bundle;
import androidx.media3.common.Tracks;
import com.google.common.base.Function;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qk1 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19129a;

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f19129a) {
            case 0:
                return ((Tracks.Group) obj).toBundle();
            case 1:
                return Tracks.Group.fromBundle((Bundle) obj);
            default:
                return ((Map) obj).keySet().iterator();
        }
    }
}
