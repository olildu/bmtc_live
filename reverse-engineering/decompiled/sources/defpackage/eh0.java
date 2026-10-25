package defpackage;

import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import app.chalo.android.MainActivity;
import com.canhub.cropper.CropImageContractOptions;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15553a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ eh0(MainActivity mainActivity, int i) {
        this.f15553a = i;
        this.b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15553a;
        Unit unit = Unit.f17538a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                IntentSenderRequest it = (IntentSenderRequest) obj;
                AtomicInteger atomicInteger = MainActivity.o1;
                Intrinsics.i(it, "it");
                mainActivity.E0.h.a(it);
                break;
            case 1:
                IntentSenderRequest it2 = (IntentSenderRequest) obj;
                AtomicInteger atomicInteger2 = MainActivity.o1;
                Intrinsics.i(it2, "it");
                mainActivity.E0.f.a(it2);
                break;
            case 2:
                String[] it3 = (String[]) obj;
                AtomicInteger atomicInteger3 = MainActivity.o1;
                Intrinsics.i(it3, "it");
                mainActivity.E0.g.a(it3);
                break;
            case 3:
                Intent it4 = (Intent) obj;
                AtomicInteger atomicInteger4 = MainActivity.o1;
                Intrinsics.i(it4, "it");
                mainActivity.E0.b.a(it4);
                break;
            case 4:
                Intent it5 = (Intent) obj;
                AtomicInteger atomicInteger5 = MainActivity.o1;
                Intrinsics.i(it5, "it");
                mainActivity.E0.i.a(it5);
                break;
            case 5:
                Intent it6 = (Intent) obj;
                AtomicInteger atomicInteger6 = MainActivity.o1;
                Intrinsics.i(it6, "it");
                mainActivity.E0.c.a(it6);
                break;
            case 6:
                Intent it7 = (Intent) obj;
                AtomicInteger atomicInteger7 = MainActivity.o1;
                Intrinsics.i(it7, "it");
                mainActivity.E0.d.a(it7);
                break;
            case 7:
                CropImageContractOptions it8 = (CropImageContractOptions) obj;
                AtomicInteger atomicInteger8 = MainActivity.o1;
                Intrinsics.i(it8, "it");
                mainActivity.E0.e.a(it8);
                break;
            default:
                Intent it9 = (Intent) obj;
                AtomicInteger atomicInteger9 = MainActivity.o1;
                Intrinsics.i(it9, "it");
                mainActivity.E0.j.a(it9);
                break;
        }
        return unit;
    }
}
