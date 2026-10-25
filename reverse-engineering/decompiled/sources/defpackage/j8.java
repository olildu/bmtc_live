package defpackage;

import aaj.c;
import aaj.d;
import aba.a;
import android.view.View;
import androidx.lifecycle.Observer;
import com.phonepe.intent.sdk.R;
import com.phonepe.intent.sdk.ui.b2bPg.B2bPgActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j8 implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17380a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j8(Object obj, int i) {
        this.f17380a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f17380a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                B2bPgActivity this$0 = (B2bPgActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = B2bPgActivity.k0;
                Intrinsics.i(this$0, "this$0");
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    View viewFindViewById = this$0.findViewById(R.id.progressBar);
                    Intrinsics.h(viewFindViewById, "findViewById<ProgressBar>(R.id.progressBar)");
                    viewFindViewById.setVisibility(zBooleanValue ? 0 : 8);
                }
                break;
            default:
                a aVar = (a) obj2;
                d dVar = (d) obj;
                if (dVar instanceof c) {
                    aVar.requireActivity().runOnUiThread(new ao1(10, aVar, ((c) dVar).f212a));
                }
                break;
        }
    }
}
