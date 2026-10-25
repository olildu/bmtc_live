package app.chalo.login.userprofiling.ruleengine;

import app.chalo.login.userprofiling.data.UserProfilingHooksRuleConfig;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/PersistedRuleState;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PersistedRuleState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5378a;
    public final String b;
    public final int c;
    public final Long d;
    public final UserProfilingHooksRuleConfig e;
    public final SessionCountInfo f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/PersistedRuleState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/userprofiling/ruleengine/PersistedRuleState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PersistedRuleState> serializer() {
            return PersistedRuleState$$serializer.f5379a;
        }
    }

    public /* synthetic */ PersistedRuleState(int i, String str, String str2, int i2, Long l, UserProfilingHooksRuleConfig userProfilingHooksRuleConfig, SessionCountInfo sessionCountInfo) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(PersistedRuleState$$serializer.f5379a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5378a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = userProfilingHooksRuleConfig;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = sessionCountInfo;
        }
    }

    public static PersistedRuleState a(PersistedRuleState persistedRuleState, int i, Long l, UserProfilingHooksRuleConfig userProfilingHooksRuleConfig, SessionCountInfo sessionCountInfo, int i2) {
        String userId = persistedRuleState.f5378a;
        String ruleId = persistedRuleState.b;
        if ((i2 & 4) != 0) {
            i = persistedRuleState.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            l = persistedRuleState.d;
        }
        Long l2 = l;
        if ((i2 & 16) != 0) {
            userProfilingHooksRuleConfig = persistedRuleState.e;
        }
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2 = userProfilingHooksRuleConfig;
        if ((i2 & 32) != 0) {
            sessionCountInfo = persistedRuleState.f;
        }
        Intrinsics.i(userId, "userId");
        Intrinsics.i(ruleId, "ruleId");
        return new PersistedRuleState(userId, ruleId, i3, l2, userProfilingHooksRuleConfig2, sessionCountInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistedRuleState)) {
            return false;
        }
        PersistedRuleState persistedRuleState = (PersistedRuleState) obj;
        return Intrinsics.d(this.f5378a, persistedRuleState.f5378a) && Intrinsics.d(this.b, persistedRuleState.b) && this.c == persistedRuleState.c && Intrinsics.d(this.d, persistedRuleState.d) && Intrinsics.d(this.e, persistedRuleState.e) && Intrinsics.d(this.f, persistedRuleState.f);
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f5378a.hashCode() * 31, 31, this.b) + this.c) * 31;
        Long l = this.d;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig = this.e;
        int iHashCode2 = (iHashCode + (userProfilingHooksRuleConfig == null ? 0 : userProfilingHooksRuleConfig.hashCode())) * 31;
        SessionCountInfo sessionCountInfo = this.f;
        return iHashCode2 + (sessionCountInfo != null ? sessionCountInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PersistedRuleState(userId=", this.f5378a, ", ruleId=", this.b, ", cooldownIndex=");
        sbE.append(this.c);
        sbE.append(", sessionVisibilityStartedOn=");
        sbE.append(this.d);
        sbE.append(", configLastUsed=");
        sbE.append(this.e);
        sbE.append(", sessionCountInfo=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public PersistedRuleState(String userId, String ruleId, int i, Long l, UserProfilingHooksRuleConfig userProfilingHooksRuleConfig, SessionCountInfo sessionCountInfo) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(ruleId, "ruleId");
        this.f5378a = userId;
        this.b = ruleId;
        this.c = i;
        this.d = l;
        this.e = userProfilingHooksRuleConfig;
        this.f = sessionCountInfo;
    }

    public /* synthetic */ PersistedRuleState(String str, String str2) {
        this(str, str2, 0, null, null, null);
    }
}
