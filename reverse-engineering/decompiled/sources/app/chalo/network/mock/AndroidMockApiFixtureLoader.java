package app.chalo.network.mock;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/AndroidMockApiFixtureLoader;", "Lapp/chalo/network/mock/MockApiFixtureLoader;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidMockApiFixtureLoader implements MockApiFixtureLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6469a;

    public AndroidMockApiFixtureLoader(Context context) {
        this.f6469a = context;
    }

    @Override // app.chalo.network.mock.MockApiFixtureLoader
    public final String a(String path) {
        Object objA;
        Intrinsics.i(path, "path");
        try {
            InputStream inputStreamOpen = this.f6469a.getAssets().open(path);
            Intrinsics.h(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.f17672a), 8192);
            try {
                objA = TextStreamsKt.a(bufferedReader);
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objA = ResultKt.a(th3);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        return (String) objA;
    }
}
