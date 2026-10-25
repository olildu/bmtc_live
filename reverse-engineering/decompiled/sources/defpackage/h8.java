package defpackage;

import aad.d;
import aag.b;
import aag.m;
import aam.f;
import aam.h;
import aam.n;
import aay.a;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.phonepe.intent.sdk.ui.b2bPg.B2bPgActivity;
import in.juspay.hyper.constants.LogCategory;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h8 implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15799a;
    public final /* synthetic */ B2bPgActivity b;

    public /* synthetic */ h8(B2bPgActivity b2bPgActivity, int i) {
        this.f15799a = i;
        this.b = b2bPgActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        String string;
        String strJ;
        String string2 = null;
        ActivityResult activityResult = (ActivityResult) obj;
        switch (this.f15799a) {
            case 0:
                int i = B2bPgActivity.k0;
                a aVar = this.b.i0;
                if (aVar == null) {
                    Intrinsics.q("b2BPgBaseViewModel");
                    throw null;
                }
                int resultCode = activityResult.getResultCode();
                Intent data = activityResult.getData();
                boolean z = resultCode == 0;
                h hVarA = h.a(data);
                if (z) {
                    if (hVarA == null || (string = hVarA.toString()) == null) {
                        n nVarH = aVar.f247a.h("FAILED");
                        if (nVarH != null) {
                            string2 = nVarH.j();
                        }
                    } else {
                        string2 = string;
                    }
                } else if (hVarA != null) {
                    string2 = hVarA.toString();
                }
                Map mapI = MapsKt.i(new Pair("response", string2), new Pair("isUserCancelled", Boolean.valueOf(z)), new Pair("targetPackageName", aVar.b));
                try {
                    b bVar = (b) m.a().c(b.class);
                    f fVarB = bVar.b("B2B_PG_UPI_APP_RETURNED_RESULT");
                    for (Map.Entry entry : mapI.entrySet()) {
                        fVarB.k(entry.getValue(), (String) entry.getKey());
                    }
                    bVar.f(fVarB);
                    break;
                } catch (Exception unused) {
                }
                aVar.d.setValue(new aau.b(string2, Boolean.valueOf(z)));
                return;
            default:
                int i2 = aaz.b.g0;
                String message = "result code from app: " + activityResult.getResultCode();
                Intrinsics.i(message, "message");
                h hVarA2 = h.a(activityResult.getData());
                B2bPgActivity b2bPgActivity = this.b;
                n nVarH2 = b2bPgActivity.j0().h("FAILED");
                if (hVarA2 == null || (strJ = hVarA2.toString()) == null) {
                    strJ = nVarH2.j();
                }
                String strA = activityResult.getResultCode() == 0 ? d.a(aae.a.RESULT_CANCELLED, strJ) : d.a(aae.a.RESULT_OK, null);
                b2bPgActivity.l0(b2bPgActivity.d0, null, null, b2bPgActivity.e0, strA);
                String str = b2bPgActivity.e0;
                String str2 = b2bPgActivity.d0;
                Pair pair = new Pair("request", strA);
                if (str == null) {
                    str = "";
                }
                Pair pair2 = new Pair(LogCategory.CONTEXT, str);
                if (str2 == null) {
                    str2 = "";
                }
                Map mapI2 = MapsKt.i(pair, pair2, new Pair("callback", str2));
                try {
                    b bVar2 = (b) m.a().c(b.class);
                    f fVarB2 = bVar2.b("CALLBACK_RETURNED_TO_WEB_FROM_ACTIVITY_RESULT");
                    for (Map.Entry entry2 : mapI2.entrySet()) {
                        fVarB2.k(entry2.getValue(), (String) entry2.getKey());
                    }
                    bVar2.f(fVarB2);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
