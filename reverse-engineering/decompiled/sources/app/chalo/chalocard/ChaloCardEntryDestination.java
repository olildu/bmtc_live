package app.chalo.chalocard;

import defpackage.ji;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lapp/chalo/chalocard/ChaloCardEntryDestination;", "", "<init>", "(Ljava/lang/String;I)V", "CARD_INFO_SCREEN", "CARD_RECHARGE_AMOUNT_SCREEN", "CARD_TRANSACTIONS_SCREEN", "CARD_RECHARGE_BY_ENTERING_CARD_NUMBER_SCREEN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum ChaloCardEntryDestination {
    CARD_INFO_SCREEN,
    CARD_RECHARGE_AMOUNT_SCREEN,
    CARD_TRANSACTIONS_SCREEN,
    CARD_RECHARGE_BY_ENTERING_CARD_NUMBER_SCREEN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(6));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/chalocard/ChaloCardEntryDestination$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/chalocard/ChaloCardEntryDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardEntryDestination> serializer() {
            return (KSerializer) ChaloCardEntryDestination.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.chalocard.ChaloCardEntryDestination", values());
    }

    public static EnumEntries<ChaloCardEntryDestination> getEntries() {
        return $ENTRIES;
    }
}
