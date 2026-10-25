package app.chalo.login.truecaller;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupHandler;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TruecallerSetupHandler extends AutoCloseable {
    void S(TruecallerSetupConfig truecallerSetupConfig, Function1 function1);

    MutableStateFlow d0();

    void h0(int i, int i2, Intent intent);

    boolean m();

    void y(String str);

    boolean z();
}
