package app.chalo.login.userprofiling.ruleengine;

import defpackage.i71;
import defpackage.uf0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/SessionCountInfo;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SessionCountInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5380a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/SessionCountInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/userprofiling/ruleengine/SessionCountInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SessionCountInfo> serializer() {
            return SessionCountInfo$$serializer.f5381a;
        }
    }

    public /* synthetic */ SessionCountInfo(int i, long j, long j2) {
        if ((i & 1) == 0) {
            this.f5380a = 0L;
        } else {
            this.f5380a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCountInfo)) {
            return false;
        }
        SessionCountInfo sessionCountInfo = (SessionCountInfo) obj;
        return this.f5380a == sessionCountInfo.f5380a && this.b == sessionCountInfo.b;
    }

    public final int hashCode() {
        long j = this.f5380a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return uf0.m(this.b, ")", i71.g(this.f5380a, "SessionCountInfo(sessionNumber=", ", shownCount="));
    }

    public SessionCountInfo(long j, long j2) {
        this.f5380a = j;
        this.b = j2;
    }
}
