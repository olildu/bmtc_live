package app.chalo.login.smsautoread;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import defpackage.i4;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/smsautoread/AndroidSmsAutoReader;", "Lapp/chalo/login/smsautoread/SmsAutoReader;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSmsAutoReader implements SmsAutoReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5286a;
    public final SmsBroadcastReceiver b;
    public final Lazy c = LazyKt.b(new i4(this, 4));

    public AndroidSmsAutoReader(Context context, SmsBroadcastReceiver smsBroadcastReceiver) {
        this.f5286a = context;
        this.b = smsBroadcastReceiver;
    }

    @Override // app.chalo.login.smsautoread.SmsAutoReader
    public final void a() {
        ((SmsRetrieverClient) this.c.getValue()).startSmsRetriever();
    }

    @Override // app.chalo.login.smsautoread.SmsAutoReader
    public final FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 b() {
        IntentFilter intentFilter = new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION);
        int i = Build.VERSION.SDK_INT;
        Context context = this.f5286a;
        SmsBroadcastReceiver smsBroadcastReceiver = this.b;
        if (i >= 34) {
            context.registerReceiver(smsBroadcastReceiver, intentFilter, SmsRetriever.SEND_PERMISSION, null, 2);
        } else {
            context.registerReceiver(smsBroadcastReceiver, intentFilter, SmsRetriever.SEND_PERMISSION, null);
        }
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(smsBroadcastReceiver.b, new AndroidSmsAutoReader$receiveSmsStatus$1(this, null));
    }
}
