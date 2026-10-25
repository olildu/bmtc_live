package app.chalo.login.phonenumberhint;

import android.content.Context;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import defpackage.eh0;
import defpackage.g;
import defpackage.i4;
import defpackage.iz0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/phonenumberhint/AndroidPhoneNumberHintHandler;", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintHandler;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidPhoneNumberHintHandler implements PhoneNumberHintHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5281a;
    public final eh0 b;
    public final Lazy c = LazyKt.b(new i4(this, 1));
    public final SharedFlowImpl d;
    public final Flow e;

    public AndroidPhoneNumberHintHandler(Context context, eh0 eh0Var) {
        this.f5281a = context;
        this.b = eh0Var;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.d = sharedFlowImplB;
        this.e = FlowKt.b(sharedFlowImplB);
    }

    @Override // app.chalo.login.phonenumberhint.PhoneNumberHintHandler
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Flow getE() {
        return this.e;
    }

    @Override // app.chalo.login.phonenumberhint.PhoneNumberHintHandler
    public final void b() {
        SignInClient signInClient = (SignInClient) this.c.getValue();
        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequestBuild = GetPhoneNumberHintIntentRequest.builder().build();
        Intrinsics.h(getPhoneNumberHintIntentRequestBuild, "build(...)");
        signInClient.getPhoneNumberHintIntent(getPhoneNumberHintIntentRequestBuild).addOnSuccessListener(new iz0(new g(this, 6), 6)).addOnFailureListener(new iz0(this, 7));
    }
}
