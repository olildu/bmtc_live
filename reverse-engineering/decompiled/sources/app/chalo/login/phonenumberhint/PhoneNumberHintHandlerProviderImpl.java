package app.chalo.login.phonenumberhint;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/phonenumberhint/PhoneNumberHintHandlerProviderImpl;", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintHandlerSetter;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneNumberHintHandlerProviderImpl implements PhoneNumberHintHandlerSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f5282a;

    @Override // app.chalo.login.phonenumberhint.PhoneNumberHintHandlerSetter
    public final void a(Lazy handler) {
        Intrinsics.i(handler, "handler");
        this.f5282a = handler;
    }

    @Override // app.chalo.login.phonenumberhint.PhoneNumberHintHandlerSetter
    public final void b() {
        this.f5282a = null;
    }

    @Override // app.chalo.login.phonenumberhint.PhoneNumberHintHandlerProvider
    public final PhoneNumberHintHandler c() {
        Lazy lazy = this.f5282a;
        if (lazy != null) {
            return (PhoneNumberHintHandler) lazy.getValue();
        }
        return null;
    }
}
