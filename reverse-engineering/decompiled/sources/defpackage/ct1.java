package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.inmobi.media.C2710wa;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ct1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15404a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ ct1(JsResult jsResult, int i) {
        this.f15404a = i;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f15404a) {
            case 0:
                C2710wa.a(this.b, dialogInterface, i);
                break;
            case 1:
                C2710wa.b(this.b, dialogInterface, i);
                break;
            default:
                C2710wa.c(this.b, dialogInterface, i);
                break;
        }
    }
}
