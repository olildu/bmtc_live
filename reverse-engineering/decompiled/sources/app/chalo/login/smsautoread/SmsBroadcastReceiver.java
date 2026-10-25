package app.chalo.login.smsautoread;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/smsautoread/SmsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmsBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFlowImpl f5290a;
    public final SharedFlow b;

    public SmsBroadcastReceiver() {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.f5290a = sharedFlowImplB;
        this.b = FlowKt.b(sharedFlowImplB);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Status status;
        if (Intrinsics.d(intent != null ? intent.getAction() : null, SmsRetriever.SMS_RETRIEVED_ACTION)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                status = (Status) (Build.VERSION.SDK_INT >= 33 ? BundleCompat.getParcelable(extras, "com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class) : extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS"));
            } else {
                status = null;
            }
            if (status == null) {
                status = null;
            }
            Integer numValueOf = status != null ? Integer.valueOf(status.getStatusCode()) : null;
            SharedFlowImpl sharedFlowImpl = this.f5290a;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                String string = extras.getString(SmsRetriever.EXTRA_SMS_MESSAGE);
                if (string != null) {
                    sharedFlowImpl.f(new SMSStatus.Success(string));
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 15) {
                sharedFlowImpl.f(SMSStatus.Timeout.f5288a);
            } else {
                sharedFlowImpl.f(SMSStatus.Unknown.f5289a);
            }
        }
    }
}
