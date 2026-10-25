package app.chalo.login.userprofiling.data;

import defpackage.dn1;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/userprofiling/data/UserProfilingHooksRulesCityConfig;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserProfilingHooksRulesCityConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5370a;
    public final UserProfilingHooksRulesForCity b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/userprofiling/data/UserProfilingHooksRulesCityConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/userprofiling/data/UserProfilingHooksRulesCityConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserProfilingHooksRulesCityConfig> serializer() {
            return UserProfilingHooksRulesCityConfig$$serializer.f5371a;
        }
    }

    public UserProfilingHooksRulesCityConfig(int i, List list, UserProfilingHooksRulesForCity userProfilingHooksRulesForCity) {
        this.f5370a = (i & 1) == 0 ? EmptyList.f17557a : list;
        if ((i & 2) == 0) {
            this.b = new UserProfilingHooksRulesForCity(LogConstants.DEFAULT_CHANNEL, EmptyList.f17557a);
        } else {
            this.b = userProfilingHooksRulesForCity;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilingHooksRulesCityConfig)) {
            return false;
        }
        UserProfilingHooksRulesCityConfig userProfilingHooksRulesCityConfig = (UserProfilingHooksRulesCityConfig) obj;
        return Intrinsics.d(this.f5370a, userProfilingHooksRulesCityConfig.f5370a) && Intrinsics.d(this.b, userProfilingHooksRulesCityConfig.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5370a.hashCode() * 31);
    }

    public final String toString() {
        return "UserProfilingHooksRulesCityConfig(cities=" + this.f5370a + ", default=" + this.b + ")";
    }
}
