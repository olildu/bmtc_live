package defpackage;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import androidx.media3.ui.TrackSelectionDialogBuilder;
import androidx.media3.ui.TrackSelectionView;
import com.inmobi.media.C2710wa;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bt1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11229a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bt1(int i, Object obj, Object obj2) {
        this.f11229a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f11229a) {
            case 0:
                C2710wa.a((GeolocationPermissions.Callback) this.b, (String) this.c, dialogInterface, i);
                break;
            case 1:
                C2710wa.b((GeolocationPermissions.Callback) this.b, (String) this.c, dialogInterface, i);
                break;
            default:
                ((TrackSelectionDialogBuilder) this.b).lambda$setUpDialogView$1((TrackSelectionView) this.c, dialogInterface, i);
                break;
        }
    }
}
