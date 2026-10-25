package defpackage;

import aag.m;
import aaz.b;
import abb.a;
import android.content.DialogInterface;
import com.canhub.cropper.CropImageActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uq1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19769a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uq1(Object obj, int i) {
        this.f19769a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        int i2 = this.f19769a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                b bVar = (b) obj;
                int i3 = b.g0;
                a aVar = bVar.c0;
                if (aVar == null) {
                    Intrinsics.q("webViewModel");
                    throw null;
                }
                aVar.f255a.postValue(aaj.a.f210a);
                try {
                    aag.b bVar2 = (aag.b) m.a().c(aag.b.class);
                    bVar2.f(bVar2.b("WEB_ACTIVITY_BACK_PRESSED"));
                    break;
                } catch (Exception unused) {
                }
                bVar.finish();
                return;
            case 1:
                int i4 = b.g0;
                Intrinsics.i(dialog, "dialog");
                a aVar2 = ((b) obj).c0;
                if (aVar2 == null) {
                    Intrinsics.q("webViewModel");
                    throw null;
                }
                aVar2.f255a.postValue(aaj.b.f211a);
                dialog.dismiss();
                return;
            default:
                Function1 openSource = (Function1) obj;
                int i5 = CropImageActivity.h0;
                Intrinsics.i(openSource, "$openSource");
                openSource.invoke(i == 0 ? CropImageActivity.Source.CAMERA : CropImageActivity.Source.GALLERY);
                return;
        }
    }
}
