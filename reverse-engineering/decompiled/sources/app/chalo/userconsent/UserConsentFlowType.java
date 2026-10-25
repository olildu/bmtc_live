package app.chalo.userconsent;

import defpackage.dn1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/userconsent/UserConsentFlowType;", "", "Companion", "FreshLogin", "ExistingUser", "Lapp/chalo/userconsent/UserConsentFlowType$ExistingUser;", "Lapp/chalo/userconsent/UserConsentFlowType$FreshLogin;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class UserConsentFlowType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10301a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(15));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userconsent/UserConsentFlowType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/userconsent/UserConsentFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UserConsentFlowType> serializer() {
            return (KSerializer) UserConsentFlowType.f10301a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/userconsent/UserConsentFlowType$FreshLogin;", "Lapp/chalo/userconsent/UserConsentFlowType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FreshLogin extends UserConsentFlowType {
        public static final FreshLogin INSTANCE = new FreshLogin();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(16));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FreshLogin);
        }

        public final int hashCode() {
            return 366475053;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<FreshLogin> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "FreshLogin";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/userconsent/UserConsentFlowType$ExistingUser;", "Lapp/chalo/userconsent/UserConsentFlowType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ExistingUser extends UserConsentFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final boolean b;
        public final boolean c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userconsent/UserConsentFlowType$ExistingUser$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/userconsent/UserConsentFlowType$ExistingUser;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ExistingUser> serializer() {
                return UserConsentFlowType$ExistingUser$$serializer.f10302a;
            }
        }

        public /* synthetic */ ExistingUser(int i, boolean z, boolean z2) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(UserConsentFlowType$ExistingUser$$serializer.f10302a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = z;
            if ((i & 2) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExistingUser)) {
                return false;
            }
            ExistingUser existingUser = (ExistingUser) obj;
            return this.b == existingUser.b && this.c == existingUser.c;
        }

        public final int hashCode() {
            return ((this.b ? 1231 : 1237) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            return "ExistingUser(allowBackPress=" + this.b + ", shouldForceFetch=" + this.c + ")";
        }

        public ExistingUser(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }
    }
}
