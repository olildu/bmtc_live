package app.chalo.multimodalticket.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.scenes.args.GroupTicketLegSelectionArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent$handleInitializationIntent$1", f = "GroupTicketLegSelectionComponent.kt", l = {TypedValues.PositionType.TYPE_POSITION_TYPE, 518, 549}, m = "invokeSuspend", v = 1)
final class GroupTicketLegSelectionComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupTicketLegSelectionArgs $args;
    Object L$0;
    int label;
    final /* synthetic */ GroupTicketLegSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTicketLegSelectionComponent$handleInitializationIntent$1(GroupTicketLegSelectionArgs groupTicketLegSelectionArgs, GroupTicketLegSelectionComponent groupTicketLegSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$args = groupTicketLegSelectionArgs;
        this.this$0 = groupTicketLegSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GroupTicketLegSelectionComponent$handleInitializationIntent$1(this.$args, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GroupTicketLegSelectionComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01c1 A[EDGE_INSN: B:106:0x01c1->B:79:0x01c1 BREAK  A[LOOP:3: B:61:0x0179->B:74:0x01a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c1 A[EDGE_INSN: B:108:0x01c1->B:79:0x01c1 BREAK  A[LOOP:3: B:61:0x0179->B:74:0x01a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c1 A[EDGE_INSN: B:109:0x01c1->B:79:0x01c1 BREAK  A[LOOP:3: B:61:0x0179->B:74:0x01a9, LOOP_LABEL: LOOP:3: B:61:0x0179->B:74:0x01a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[LOOP:4: B:76:0x01b1->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153 A[LOOP:2: B:55:0x0151->B:56:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:67:0x0194  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0222 A[LOOP:5: B:86:0x0220->B:87:0x0222, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x0242  */
    /* JADX WARN: Code duplicated, block: B:93:0x024f A[LOOP:6: B:92:0x024d->B:93:0x024f, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r2.M0(r4, app.chalo.providers.toast.ToastLength.SHORT, r17) == r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
    
        if (r2.M0(r4, app.chalo.providers.toast.ToastLength.SHORT, r17) == r1) goto L81;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent$handleInitializationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
